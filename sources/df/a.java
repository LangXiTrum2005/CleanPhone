package df;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import fc.f;
import java.util.HashSet;
import qd.i;
import ti.b;
import wi.j;
import xi.g;
import xi.h;
import xi.m;
import xi.n;
import xi.o;
import xi.p;
import xi.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements b, n, h, ui.a, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f38841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f38842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f38843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ui.b f38844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38846f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f38847g;

    public final boolean a(Intent intent) {
        String dataString;
        if (intent == null) {
            return false;
        }
        Log.d("com.llfbandit.app_links", intent.toString());
        if ((intent.getFlags() & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
            return false;
        }
        String action = intent.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SENDTO".equals(action)) {
            dataString = null;
        } else {
            dataString = intent.getDataString();
            if (dataString != null) {
                Log.d("com.llfbandit.app_links", "Handled intent: action: " + action + " / data: " + dataString);
            }
        }
        if (dataString == null) {
            return false;
        }
        if (this.f38845e == null) {
            this.f38845e = dataString;
        }
        this.f38847g = dataString;
        g gVar = this.f38843c;
        if (gVar != null) {
            this.f38846f = true;
            gVar.b(dataString);
        }
        return true;
    }

    @Override // xi.h
    public final void g(g gVar) {
        String str;
        this.f38843c = gVar;
        if (this.f38846f || (str = this.f38845e) == null) {
            return;
        }
        this.f38846f = true;
        gVar.b(str);
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        this.f38844d = bVar;
        f fVar = (f) bVar;
        fVar.d(this);
        a(((Activity) fVar.f40780b).getIntent());
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        p pVar = new p(aVar.f50789c, "com.llfbandit.app_links/messages");
        this.f38841a = pVar;
        pVar.b(this);
        i iVar = new i(aVar.f50789c, "com.llfbandit.app_links/events");
        this.f38842b = iVar;
        iVar.A(this);
    }

    @Override // xi.h
    public final void onCancel() {
        this.f38843c = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        ui.b bVar = this.f38844d;
        if (bVar != null) {
            ((HashSet) ((f) bVar).f40784f).remove(this);
        }
        this.f38844d = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        this.f38841a.b(null);
        this.f38842b.A(null);
    }

    @Override // xi.n
    public final void onMethodCall(m mVar, o oVar) {
        if (mVar.f53822a.equals("getLatestLink")) {
            ((j) oVar).a(this.f38847g);
        } else if (!mVar.f53822a.equals("getInitialLink")) {
            ((j) oVar).c();
        } else {
            ((j) oVar).a(this.f38845e);
        }
    }

    @Override // xi.s
    public final boolean onNewIntent(Intent intent) {
        return a(intent);
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        this.f38844d = bVar;
        ((f) bVar).d(this);
    }
}
