// Generated code from Butter Knife. Do not modify!
package com.example.GameDaTing;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.androidteris.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GamePingTaiActivity_ViewBinding<T extends GamePingTaiActivity> implements Unbinder {
  protected T target;

  @UiThread
  public GamePingTaiActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.wvPrivacyProtocolActivity = Utils.findRequiredViewAsType(source, R.id.wvPrivacyProtocolActivity, "field 'wvPrivacyProtocolActivity'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.wvPrivacyProtocolActivity = null;

    this.target = null;
  }
}
