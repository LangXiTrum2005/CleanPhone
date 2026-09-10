package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLockHintBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDialogFragment<VB extends ViewBinding> extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewBinding f2789a;

    public final ViewBinding a() {
        ViewBinding viewBinding = this.f2789a;
        if (viewBinding != null) {
            return viewBinding;
        }
        AbstractC2995aW.x0("mBinding");
        throw null;
    }

    public void b() {
    }

    public abstract DialogLockHintBinding c(LayoutInflater layoutInflater);

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 17;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setGravity(17);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.addFlags(201326848);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
            dialog2.setCancelable(true);
        }
        b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC2995aW.q(layoutInflater, "inflater");
        DialogLockHintBinding dialogLockHintBindingC = c(layoutInflater);
        this.f2789a = dialogLockHintBindingC;
        return dialogLockHintBindingC.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(4866);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        AbstractC2995aW.q(fragmentManager, "manager");
        try {
            Class<? super Object> superclass = getClass().getSuperclass().getSuperclass();
            AbstractC2995aW.p(superclass, "getSuperclass(...)");
            Object objNewInstance = superclass.getConstructor(new Class[0]).newInstance(new Object[0]);
            Field declaredField = superclass.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(objNewInstance, Boolean.FALSE);
            Field declaredField2 = superclass.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(objNewInstance, Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        AbstractC2995aW.p(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        fragmentTransactionBeginTransaction.remove(this).add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
