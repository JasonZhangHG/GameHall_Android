// Generated code from Butter Knife. Do not modify!
package com.example.GameDaTing;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.androidteris.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GameDaTingActivity_ViewBinding<T extends GameDaTingActivity> implements Unbinder {
  protected T target;

  @UiThread
  public GameDaTingActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.btnGameDaTingActivityXiuXian = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityXiuXian, "field 'btnGameDaTingActivityXiuXian'", Button.class);
    target.btnGameDaTingActivityDongZuo = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityDongZuo, "field 'btnGameDaTingActivityDongZuo'", Button.class);
    target.btnGameDaTingActivityQiPai = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityQiPai, "field 'btnGameDaTingActivityQiPai'", Button.class);
    target.btnGameDaTingActivityFeiXing = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityFeiXing, "field 'btnGameDaTingActivityFeiXing'", Button.class);
    target.btnGameDaTingActivityKaPai = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityKaPai, "field 'btnGameDaTingActivityKaPai'", Button.class);
    target.btnGameDaTingActivityMoNi = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityMoNi, "field 'btnGameDaTingActivityMoNi'", Button.class);
    target.btnGameDaTingActivityTiYu = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityTiYu, "field 'btnGameDaTingActivityTiYu'", Button.class);
    target.btnGameDaTingActivityErLuoShi = Utils.findRequiredViewAsType(source, R.id.btnGameDaTingActivityErLuoShi, "field 'btnGameDaTingActivityErLuoShi'", Button.class);
    target.llKindActivityAll = Utils.findRequiredViewAsType(source, R.id.llKindActivityAll, "field 'llKindActivityAll'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.btnGameDaTingActivityXiuXian = null;
    target.btnGameDaTingActivityDongZuo = null;
    target.btnGameDaTingActivityQiPai = null;
    target.btnGameDaTingActivityFeiXing = null;
    target.btnGameDaTingActivityKaPai = null;
    target.btnGameDaTingActivityMoNi = null;
    target.btnGameDaTingActivityTiYu = null;
    target.btnGameDaTingActivityErLuoShi = null;
    target.llKindActivityAll = null;

    this.target = null;
  }
}
