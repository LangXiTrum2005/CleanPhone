package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21533c;

    public /* synthetic */ wl0(int i10, Object obj, Object obj2) {
        this.f21531a = i10;
        this.f21532b = obj;
        this.f21533c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f21531a) {
            case 0:
                zl0 zl0Var = (zl0) this.f21532b;
                zzm zzmVar = (zzm) this.f21533c;
                zl0Var.f22656f.b(zl0Var.f22657g);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                zl0Var.D1(zl0Var.f22657g, "dialog_click", map);
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
            case 1:
                zl0 zl0Var2 = (zl0) this.f21532b;
                zzm zzmVar2 = (zzm) this.f21533c;
                zl0Var2.f22656f.b(zl0Var2.f22657g);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                zl0Var2.D1(zl0Var2.f22657g, "rtsdc", map2);
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
                break;
            default:
                ((JsPromptResult) this.f21532b).confirm(((EditText) this.f21533c).getText().toString());
                break;
        }
    }
}
