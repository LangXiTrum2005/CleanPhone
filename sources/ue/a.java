package ue;

import an.h;
import android.app.Activity;
import android.util.Log;
import com.ironsource.V5;
import d8.c;
import fc.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hk.k;
import java.io.File;
import kotlin.Metadata;
import ti.b;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lue/a;", "Lti/b;", "Lui/a;", "Lxi/n;", "<init>", "()V", "file_saver_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, ui.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f52193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ui.b f52194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ti.a f52195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f52196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f52197e;

    public final String a(String str, byte[] bArr, String str2, Boolean bool) {
        try {
            ui.b bVar = this.f52194b;
            kotlin.jvm.internal.n.c(bVar);
            File externalFilesDir = ((Activity) ((f) bVar).f40780b).getBaseContext().getExternalFilesDir(null);
            if (str2 == null) {
                str2 = "";
            }
            if (kotlin.jvm.internal.n.a(bool, Boolean.TRUE)) {
                if (h.K0(str2, '.')) {
                    str = str + str2;
                } else {
                    str = str + '.' + str2;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.n.c(externalFilesDir);
            sb2.append(externalFilesDir.getAbsolutePath());
            sb2.append('/');
            sb2.append(str);
            File file = new File(sb2.toString());
            kotlin.jvm.internal.n.c(bArr);
            k.W(file, bArr);
            return externalFilesDir.getAbsolutePath() + '/' + file.getName();
        } catch (Exception e10) {
            Log.d("FileSaver", "Error While Saving File" + e10.getMessage());
            return "Error While Saving File" + e10.getMessage();
        }
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        Log.d("FileSaver", "Attached to Activity");
        this.f52194b = binding;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        if (this.f52195c != null) {
            Log.d("FileSaver", "Already Initialized");
        }
        this.f52195c = flutterPluginBinding;
        xi.f fVar = flutterPluginBinding.f50789c;
        kotlin.jvm.internal.n.e(fVar, "getBinaryMessenger(...)");
        p pVar = new p(fVar, "file_saver");
        this.f52196d = pVar;
        pVar.b(this);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        Log.d("FileSaver", "Detached From Activity");
        c cVar = this.f52193a;
        if (cVar != null) {
            ui.b bVar = this.f52194b;
            if (bVar != null) {
                ((f) bVar).H(cVar);
            }
            this.f52193a = null;
        }
        this.f52194b = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        Log.d("FileSaver", "On Detached From ConfigChanges");
        c cVar = this.f52193a;
        if (cVar != null) {
            ui.b bVar = this.f52194b;
            if (bVar != null) {
                ((f) bVar).H(cVar);
            }
            this.f52193a = null;
        }
        this.f52194b = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        Log.d("FileSaver", "Detached From Engine");
        this.f52196d = null;
        this.f52195c = null;
        c cVar = this.f52193a;
        if (cVar != null) {
            ui.b bVar = this.f52194b;
            if (bVar != null) {
                ((f) bVar).H(cVar);
            }
            this.f52193a = null;
        }
        p pVar = this.f52196d;
        if (pVar != null) {
            pVar.b(null);
        }
    }

    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        c cVar;
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        if (this.f52193a == null) {
            Log.d("FileSaver", "Dialog was null");
            Log.d("FileSaver", "Creating File Dialog Activity");
            ui.b bVar = this.f52194b;
            if (bVar != null) {
                Activity activity = (Activity) ((f) bVar).f40780b;
                kotlin.jvm.internal.n.e(activity, "getActivity(...)");
                cVar = new c(activity);
                ui.b bVar2 = this.f52194b;
                kotlin.jvm.internal.n.c(bVar2);
                ((f) bVar2).b(cVar);
            } else {
                Log.d("FileSaver", "Activity was null");
                j jVar = this.f52197e;
                cVar = null;
                if (jVar != null) {
                    jVar.b("NullActivity", "Activity was Null", null);
                }
            }
            this.f52193a = cVar;
        }
        try {
            this.f52197e = (j) oVar;
            if (kotlin.jvm.internal.n.a(str, V5.b.f27359a)) {
                Log.d("FileSaver", "Get directory Method Called");
                ((j) oVar).a(a((String) call.a("name"), (byte[]) call.a("bytes"), (String) call.a("fileExtension"), (Boolean) call.a("includeExtension")));
            } else if (!kotlin.jvm.internal.n.a(str, "saveAs")) {
                kotlin.jvm.internal.n.c(str);
                Log.d("FileSaver", "Unknown Method called ".concat(str));
                ((j) oVar).c();
            } else {
                Log.d("FileSaver", "Save as Method Called");
                c cVar2 = this.f52193a;
                kotlin.jvm.internal.n.c(cVar2);
                cVar2.b((String) call.a("name"), (String) call.a("fileExtension"), (byte[]) call.a("bytes"), (String) call.a("mimeType"), (Boolean) call.a("includeExtension"), (j) oVar);
            }
        } catch (Exception e10) {
            Log.d("FileSaver", "Error While Calling method" + e10.getMessage());
        }
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        Log.d("FileSaver", "Re Attached to Activity");
        this.f52194b = binding;
    }
}
