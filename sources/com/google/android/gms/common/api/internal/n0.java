package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends Fragment implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f11739b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.p f11740a = new b2.p();

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f11740a.f5364c).values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void g(String str, g gVar) {
        this.f11740a.q(str, gVar);
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final g j(Class cls, String str) {
        return (g) cls.cast(((Map) this.f11740a.f5364c).get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = ((Map) this.f11740a.f5364c).values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11740a.r(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b2.p pVar = this.f11740a;
        pVar.f5363b = 5;
        Iterator it = ((Map) pVar.f5364c).values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b2.p pVar = this.f11740a;
        pVar.f5363b = 3;
        Iterator it = ((Map) pVar.f5364c).values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f11740a.s(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        b2.p pVar = this.f11740a;
        pVar.f5363b = 2;
        Iterator it = ((Map) pVar.f5364c).values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        b2.p pVar = this.f11740a;
        pVar.f5363b = 4;
        Iterator it = ((Map) pVar.f5364c).values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStop();
        }
    }
}
