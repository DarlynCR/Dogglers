// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final AppCompatImageView ivItem;

  @NonNull
  public final MaterialTextView tvAgeItem;

  @NonNull
  public final MaterialTextView tvHobbiesItem;

  @NonNull
  public final MaterialTextView tvNameItem;

  private GridListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull AppCompatImageView ivItem, @NonNull MaterialTextView tvAgeItem,
      @NonNull MaterialTextView tvHobbiesItem, @NonNull MaterialTextView tvNameItem) {
    this.rootView = rootView;
    this.ivItem = ivItem;
    this.tvAgeItem = tvAgeItem;
    this.tvHobbiesItem = tvHobbiesItem;
    this.tvNameItem = tvNameItem;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_item;
      AppCompatImageView ivItem = ViewBindings.findChildViewById(rootView, id);
      if (ivItem == null) {
        break missingId;
      }

      id = R.id.tv_age_item;
      MaterialTextView tvAgeItem = ViewBindings.findChildViewById(rootView, id);
      if (tvAgeItem == null) {
        break missingId;
      }

      id = R.id.tv_hobbies_item;
      MaterialTextView tvHobbiesItem = ViewBindings.findChildViewById(rootView, id);
      if (tvHobbiesItem == null) {
        break missingId;
      }

      id = R.id.tv_name_item;
      MaterialTextView tvNameItem = ViewBindings.findChildViewById(rootView, id);
      if (tvNameItem == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, ivItem, tvAgeItem, tvHobbiesItem,
          tvNameItem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
