package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import b0.c;
import com.google.android.gms.ads.RequestConfiguration;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import m0.m;
import m0.s0;
import x.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00122\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0004¢\u0006\u0004\b\u001a\u0010\u001bR.\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\f\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0005R\u001a\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u0005¨\u0006$"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/v;", "Lm0/m;", "<init>", "()V", "Lb0/c;", "extraData", "Lwj/r;", "putExtraData", "(Lb0/c;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Lb0/c;", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "", "", "args", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "Lx/i;", "extraDataMap", "Lx/i;", "getExtraDataMap$annotations", "Landroidx/lifecycle/x;", "lifecycleRegistry", "Landroidx/lifecycle/x;", "getLifecycleRegistry$annotations", "core"}, k = 1, mv = {2, 1, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class ComponentActivity extends Activity implements v, m {
    private final i extraDataMap = new i(0);
    private final x lifecycleRegistry = new x(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        n.f(event, "event");
        n.e(getWindow().getDecorView(), "getDecorView(...)");
        WeakHashMap weakHashMap = s0.f45746a;
        return superDispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        n.f(event, "event");
        n.e(getWindow().getDecorView(), "getDecorView(...)");
        WeakHashMap weakHashMap = s0.f45746a;
        return super.dispatchKeyShortcutEvent(event);
    }

    public <T extends c> T getExtraData(Class<T> extraDataClass) {
        n.f(extraDataClass, "extraDataClass");
        if (this.extraDataMap.get(extraDataClass) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public o getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = n0.f4570a;
        l0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        n.f(outState, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(outState);
    }

    public void putExtraData(c extraData) {
        n.f(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean shouldDumpInternalState(String[] args) {
        boolean z10 = false;
        if (args != null && args.length != 0) {
            String str = args[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        z10 = true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z10 = true;
                        }
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            z10 = true;
                        }
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        z10 = true;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        z10 = true;
                    }
                    break;
            }
        }
        return true ^ z10;
    }

    @Override // m0.m
    public boolean superDispatchKeyEvent(KeyEvent event) {
        n.f(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
