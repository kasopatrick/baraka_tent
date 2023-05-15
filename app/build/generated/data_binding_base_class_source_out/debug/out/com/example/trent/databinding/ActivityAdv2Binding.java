// Generated by view binder compiler. Do not edit!
package com.example.trent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ActivityAdv2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView advimg2;

  @NonNull
  public final TextView problems;

  @NonNull
  public final TextView txt22;

  private ActivityAdv2Binding(@NonNull LinearLayout rootView, @NonNull ImageView advimg2,
      @NonNull TextView problems, @NonNull TextView txt22) {
    this.rootView = rootView;
    this.advimg2 = advimg2;
    this.problems = problems;
    this.txt22 = txt22;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdv2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdv2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_adv2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdv2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.advimg_2;
      ImageView advimg2 = ViewBindings.findChildViewById(rootView, id);
      if (advimg2 == null) {
        break missingId;
      }

      id = R.id.problems;
      TextView problems = ViewBindings.findChildViewById(rootView, id);
      if (problems == null) {
        break missingId;
      }

      id = R.id.txt_2_2;
      TextView txt22 = ViewBindings.findChildViewById(rootView, id);
      if (txt22 == null) {
        break missingId;
      }

      return new ActivityAdv2Binding((LinearLayout) rootView, advimg2, problems, txt22);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}