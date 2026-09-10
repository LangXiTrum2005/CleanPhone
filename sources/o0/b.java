package o0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import k3.j;
import m0.c;
import m0.d;
import m0.e;
import m0.s0;
import na.g;
import p.v;
import zc.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f47032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, j jVar) {
        super(inputConnection, false);
        this.f47032a = jVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        Bundle bundle2;
        d cVar;
        g gVar = inputContentInfo == null ? null : new g(new f(inputContentInfo), 1);
        v vVar = (v) this.f47032a.f44293b;
        if ((i10 & 1) != 0) {
            try {
                ((InputContentInfo) ((f) gVar.f46631b).f54822a).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((f) gVar.f46631b).f54822a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((f) gVar.f46631b).f54822a;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new c(clipData, 2);
        } else {
            e eVar = new e();
            eVar.f45685b = clipData;
            eVar.f45686c = 2;
            cVar = eVar;
        }
        cVar.a(inputContentInfo3.getLinkUri());
        cVar.setExtras(bundle2);
        if (s0.e(vVar, cVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
