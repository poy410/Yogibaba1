package kr.co.yogibaba.www.yogibaba.shoppingtab.electronicgoods;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import kr.co.yogibaba.www.yogibaba.R;
import kr.co.yogibaba.www.yogibaba.data.ShoppingDataByCategory;

/**
 * Created by Tacademy on 2016-05-12.
 */
public class ElectronicgoodsAdapter extends RecyclerView.Adapter<ElectronicgoodsViewHolder> {
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
    public void onBindViewHolder(ElectronicgoodsViewHolder holder, int position) {
        holder.setShoppingDataByCategory(items.get(position));
        holder.setOnItemClickListener(mListener);
    }

    @Override
    public ElectronicgoodsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_shopping_item_by_category,null);
        return new ElectronicgoodsViewHolder(view);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    ElectronicgoodsViewHolder.OnItemClickListener mListener;
    public void setOnItemClicListener(ElectronicgoodsViewHolder.OnItemClickListener listener){
        mListener=listener;
    }
}
