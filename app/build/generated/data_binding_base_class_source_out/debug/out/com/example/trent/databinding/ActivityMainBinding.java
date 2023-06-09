// Generated by view binder compiler. Do not edit!
package com.example.trent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.trent.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView Image1;

  @NonNull
  public final ImageView Image2;

  @NonNull
  public final TextView edtText;

  @NonNull
  public final Button mBtnStart;

  @NonNull
  public final TextView nTvTitle;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull ImageView Image1,
      @NonNull ImageView Image2, @NonNull TextView edtText, @NonNull Button mBtnStart,
      @NonNull TextView nTvTitle) {
    this.rootView = rootView;
    this.Image1 = Image1;
    this.Image2 = Image2;
    this.edtText = edtText;
    this.mBtnStart = mBtnStart;
    this.nTvTitle = nTvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Image_1;
      ImageView Image1 = ViewBindings.findChildViewById(rootView, id);
      if (Image1 == null) {
        break missingId;
      }

      id = R.id.Image_2;
      ImageView Image2 = ViewBindings.findChildViewById(rootView, id);
      if (Image2 == null) {
        break missingId;
      }

      id = R.id.edtText;
      TextView edtText = ViewBindings.findChildViewById(rootView, id);
      if (edtText == null) {
        break missingId;
      }

      id = R.id.mBtnStart;
      Button mBtnStart = ViewBindings.findChildViewById(rootView, id);
      if (mBtnStart == null) {
        break missingId;
      }

      id = R.id.nTvTitle;
      TextView nTvTitle = ViewBindings.findChildViewById(rootView, id);
      if (nTvTitle == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, Image1, Image2, edtText, mBtnStart,
          nTvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
