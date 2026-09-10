package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.view.KeyEvent;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a implements com.mbridge.msdk.newreward.function.command.receiver.b {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.b
    public void a(Object obj) {
        try {
            Map map = (Map) obj;
            String str = (String) map.get("life_cycle");
            ViewGroup viewGroup = map.get("parent_temple") instanceof ViewGroup ? (ViewGroup) map.get("parent_temple") : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof IBaseView) {
                        ((IBaseView) childAt).onActivityLifeCycleCallback(str);
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
