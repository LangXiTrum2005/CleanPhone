package com.afollestad.materialdialogs.folderselector;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.hjq.permissions.Permission;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2607Mt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EM;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class FolderChooserDialog extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f44a;

    public final void a() {
        DM.x(getArguments().getSerializable("builder"));
    }

    public final File[] b() {
        File[] fileArrListFiles = this.f44a.listFiles();
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                arrayList.add(file);
            }
        }
        Collections.sort(arrayList, new C2607Mt((Object) null));
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        getActivity();
        getParentFragment();
        throw new IllegalStateException("FolderChooserDialog needs to be shown from an Activity/Fragment implementing FolderCallback.");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(getActivity(), Permission.READ_EXTERNAL_STORAGE) != 0) {
            FragmentActivity activity = getActivity();
            BM bm = new BM(activity);
            bm.b = activity.getText(R.string.md_error_label);
            CharSequence text = activity.getText(R.string.md_storage_perm_error);
            if (bm.m != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            bm.k = text;
            bm.l = activity.getText(android.R.string.ok);
            return new EM(bm);
        }
        if (getArguments() == null || !getArguments().containsKey("builder")) {
            throw new IllegalStateException("You must create a FolderChooserDialog using the Builder.");
        }
        if (!getArguments().containsKey("current_path")) {
            getArguments();
            a();
            throw null;
        }
        File file = new File(getArguments().getString("current_path"));
        this.f44a = file;
        try {
            int length = file.getPath().split("/").length;
        } catch (IndexOutOfBoundsException unused) {
        }
        b();
        new BM(getActivity());
        a();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
