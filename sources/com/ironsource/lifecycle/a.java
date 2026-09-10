package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29191b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0077a f29192a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface InterfaceC0077a {
        void a(Activity activity);

        void b(Activity activity);

        void c(Activity activity);
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f29191b);
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f29191b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f29191b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC0077a interfaceC0077a) {
        if (interfaceC0077a != null) {
            interfaceC0077a.b(getActivity());
        }
    }

    public void d(InterfaceC0077a interfaceC0077a) {
        this.f29192a = interfaceC0077a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f29192a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f29192a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f29192a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f29192a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC0077a interfaceC0077a) {
        if (interfaceC0077a != null) {
            interfaceC0077a.c(getActivity());
        }
    }

    private void b(InterfaceC0077a interfaceC0077a) {
        if (interfaceC0077a != null) {
            interfaceC0077a.a(getActivity());
        }
    }
}
