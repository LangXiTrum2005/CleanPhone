package com.afollestad.materialdialogs.color;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3009af;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class ColorChooserDialog extends DialogFragment implements View.OnClickListener, View.OnLongClickListener {
    public final void a() {
        if (getArguments() == null || !getArguments().containsKey("builder")) {
            return;
        }
        DM.x(getArguments().getSerializable("builder"));
    }

    public final boolean b() {
        return getArguments().getBoolean("in_sub", false);
    }

    public final int c() {
        return getArguments().getInt("top_index", -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        getActivity();
        getParentFragment();
        throw new IllegalStateException("ColorChooserDialog needs to be shown from an Activity/Fragment implementing ColorCallback.");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getTag() != null) {
            int i = Integer.parseInt(((String) view.getTag()).split(":")[0]);
            a();
            if (b() || i > -1) {
                throw null;
            }
            getArguments().putInt("top_index", i);
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        if (getArguments() == null || !getArguments().containsKey("builder")) {
            throw new IllegalStateException("ColorChooserDialog should be created using its Builder interface.");
        }
        a();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view.getTag() == null) {
            return false;
        }
        int i = Integer.parseInt(((String) view.getTag()).split(":")[1]);
        AbstractC3009af abstractC3009af = (AbstractC3009af) view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        abstractC3009af.getLocationOnScreen(iArr);
        abstractC3009af.getWindowVisibleDisplayFrame(rect);
        Context context = abstractC3009af.getContext();
        int width = abstractC3009af.getWidth();
        int height = abstractC3009af.getHeight();
        int i2 = (height / 2) + iArr[1];
        int i3 = (width / 2) + iArr[0];
        if (ViewCompat.getLayoutDirection(abstractC3009af) == 0) {
            i3 = context.getResources().getDisplayMetrics().widthPixels - i3;
        }
        Toast toastMakeText = Toast.makeText(context, String.format("#%06X", Integer.valueOf(16777215 & i)), 0);
        if (i2 < rect.height()) {
            toastMakeText.setGravity(8388661, i3, (iArr[1] + height) - rect.top);
        } else {
            toastMakeText.setGravity(81, 0, height);
        }
        toastMakeText.show();
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("top_index", c());
        bundle.putBoolean("in_sub", b());
        bundle.putInt("sub_index", -1);
        bundle.putBoolean("in_custom", false);
    }
}
