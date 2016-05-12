package kr.co.yogibaba.www.yogibaba.shoppingtab.furniture;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.co.yogibaba.www.yogibaba.R;
import kr.co.yogibaba.www.yogibaba.data.ShoppingDataByCategory;
import kr.co.yogibaba.www.yogibaba.shoppingtab.electronicgoods.ElectronicgoodsViewHolder;

/**
 * Created by Tacademy on 2016-05-12.
 */
public class FurnitureAdapter extends RecyclerView.Adapter<FurnitureViewHolder> {
    List<ShoppingDataByCategory> items=new ArrayList<>();
    public void add(ShoppingDataByCategory item)
    {
        items.add(item);
        notifyDataSetChanged();
    }
    public void addAll(List<ShoppingDataByCategory> items){
        this.items.addAll(items);
        notifyDataSetChanged();
    }
    public void clear(){
        items.clear();
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(FurnitureViewHolder holder, int position) {
        holder.setShoppingDataByCategory(items.get(position));
        holder.setOnItemClickListener(mListener);
    }

    @Override
    public FurnitureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_shopping_item_by_category,null);
        return new FurnitureViewHolder(view);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    FurnitureViewHolder.OnItemClickListener mListener;
    public void setOnItemClicListener(FurnitureViewHolder.OnItemClickListener listener){
        mListener=listener;
    }
}
