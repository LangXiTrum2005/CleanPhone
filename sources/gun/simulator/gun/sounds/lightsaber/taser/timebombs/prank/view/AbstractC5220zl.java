package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5220zl {
    public static /* synthetic */ void a(EditText[] editTextArr, View view, boolean z) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view, false);
    }

    public static void c(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yl
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                AbstractC5220zl.a(editTextArr, view, z);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new RunnableC4057mb(editText2, 1), 100L);
    }
}
