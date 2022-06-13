package com.example.listviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {
    //khai báo các thành phần của Adapter
    private int layout;
    private List<MonAn> monAnList;
    private Context context;//thành phần thao tác với dữ liệu

    //hàm tạo


    public MonAnAdapter(int layout, List<MonAn> monAnList, Context context) {
        this.layout = layout;
        this.monAnList = monAnList;
        this.context = context;
    }

    @Override
    public int getCount() { //TRẢ VỀ SỐ DÒNG DỮ LIỆU TRONG LISTVIEW
        return monAnList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {// hiển thị ra các dòng dữ liệu
        //khai báo lệnh trả về mỗi dòng dữ liệu trên listview
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        //ánh xạ các view con
        ImageView imganh = (ImageView) view.findViewById(R.id.imghinhanh);
        TextView ten = (TextView) view.findViewById(R.id.tenmonan);
        TextView mota = (TextView) view.findViewById(R.id.mota);
        TextView gia = (TextView) view.findViewById(R.id.gia);

        //gán giá trị cho các biến ánh xạ
        MonAn monan = monAnList.get(i);

        ten.setText(monan.getTen());
        gia.setText(monan.getGia());
        mota.setText(monan.getMota());
        imganh.setImageResource(monan.getHinhanh());

        return view;
    }
}
