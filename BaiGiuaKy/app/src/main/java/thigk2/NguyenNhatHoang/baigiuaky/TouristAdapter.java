package thigk2.NguyenNhatHoang.baigiuaky;
import android.content.Context;
import android.view.*;
import android.widget.*;
import java.util.List;

public class TouristAdapter extends BaseAdapter {

    private Context context;
    private List<TouristSpot> danhSach;

    public TouristAdapter(Context context, List<TouristSpot> danhSach) {
        this.context = context;
        this.danhSach = danhSach;
    }

    @Override public int getCount() { return danhSach.size(); }
    @Override public Object getItem(int i) { return danhSach.get(i); }
    @Override public long getItemId(int i) { return i; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item_tourist, parent, false);

        TouristSpot spot = danhSach.get(position);
        ImageView img = convertView.findViewById(R.id.imgSpot);
        TextView tvTen = convertView.findViewById(R.id.tvTen);
        TextView tvDiaChi = convertView.findViewById(R.id.tvDiaChi);

        img.setImageResource(spot.getHinhAnh());
        tvTen.setText(spot.getTen());
        tvDiaChi.setText(spot.getDiaChi());

        return convertView;
    }
}