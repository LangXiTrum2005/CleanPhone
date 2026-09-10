package com.p004ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f25606b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0284a f25607a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0284a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f25606b);
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f25606b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f25606b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC0284a interfaceC0284a) {
        if (interfaceC0284a != null) {
            interfaceC0284a.a(getActivity());
        }
    }

    public void d(InterfaceC0284a interfaceC0284a) {
        this.f25607a = interfaceC0284a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f25607a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f25607a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f25607a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f25607a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC0284a interfaceC0284a) {
        if (interfaceC0284a != null) {
            interfaceC0284a.b(getActivity());
        }
    }

    private void b(InterfaceC0284a interfaceC0284a) {
        if (interfaceC0284a != null) {
            interfaceC0284a.onResume(getActivity());
        }
    }
}
