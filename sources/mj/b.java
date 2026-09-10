package mj;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import com.google.android.gms.common.api.internal.u;
import com.storage.androidcleaner.R;
import qj.x;
import t.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends no.b implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f46094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentActivity f46095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cj.h f46096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f46098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f46099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46100h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f46103k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46102j = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f46101i = new u(2);

    public b(o oVar, FragmentActivity fragmentActivity, f fVar, h hVar, cj.h hVar2, boolean z10) {
        String str;
        int i10;
        this.f46094b = oVar;
        this.f46095c = fragmentActivity;
        this.f46096d = hVar2;
        this.f46098f = hVar;
        this.f46100h = fVar.f46118c.booleanValue();
        this.f46097e = fVar.f46119d.booleanValue();
        String str2 = hVar.f46131a;
        String str3 = hVar.f46140j;
        String str4 = hVar.f46132b;
        boolean zBooleanValue = fVar.f46117b.booleanValue();
        if (z10) {
            str = null;
            i10 = 33023;
        } else {
            str = hVar.f46135e;
            i10 = 255;
        }
        String str5 = str;
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (i10 != 255 && i10 != 32768 && i10 != 32783 && i10 != 33023) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            sb2.append(i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK");
            throw new IllegalArgumentException(sb2.toString());
        }
        boolean z11 = (i10 & 32768) != 0;
        if (TextUtils.isEmpty(str5) && !z11) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (!TextUtils.isEmpty(str5) && z11) {
            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
        }
        this.f46099g = new p(str3, str4, str2, str5, zBooleanValue, i10);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0039  */
    /* JADX WARN: Code duplicated, block: B:28:0x0041  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    @Override // no.b
    public final void A(int i10) {
        g gVar = g.ERROR_NOT_AVAILABLE;
        cj.h hVar = this.f46096d;
        if (i10 == 1) {
            hVar.b(gVar);
        } else if (i10 == 7) {
            hVar.b(g.ERROR_LOCKED_OUT_TEMPORARILY);
        } else if (i10 != 9) {
            h hVar2 = this.f46098f;
            boolean z10 = this.f46097e;
            if (i10 != 14) {
                if (i10 != 4) {
                    g gVar2 = g.FAILURE;
                    if (i10 != 5) {
                        if (i10 != 11) {
                            if (i10 != 12) {
                                hVar.b(gVar2);
                            } else {
                                hVar.b(gVar);
                            }
                        } else {
                            if (z10) {
                                M(hVar2.f46134d, hVar2.f46139i);
                                return;
                            }
                            hVar.b(g.ERROR_NOT_ENROLLED);
                        }
                    } else if (this.f46102j && this.f46100h) {
                        return;
                    } else {
                        hVar.b(gVar2);
                    }
                } else {
                    if (z10) {
                        M(hVar2.f46134d, hVar2.f46139i);
                        return;
                    }
                    hVar.b(g.ERROR_NOT_ENROLLED);
                }
            } else {
                if (z10) {
                    M(hVar2.f46136f, hVar2.f46137g);
                    return;
                }
                hVar.b(gVar);
            }
        } else {
            hVar.b(g.ERROR_LOCKED_OUT_PERMANENTLY);
        }
        N();
    }

    @Override // no.b
    public final void B() {
        this.f46096d.b(g.SUCCESS);
        N();
    }

    public final void M(String str, String str2) {
        FragmentActivity fragmentActivity = this.f46095c;
        View viewInflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.go_to_setting, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_required);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.go_to_setting_description);
        textView.setText(str);
        textView2.setText(str2);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(fragmentActivity, R.style.AlertDialogCustom);
        final int i10 = 0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: mj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f46093b;

            {
                this.f46093b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                switch (i10) {
                    case 0:
                        b bVar = this.f46093b;
                        bVar.f46096d.b(g.FAILURE);
                        bVar.N();
                        bVar.f46095c.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
                        break;
                    default:
                        b bVar2 = this.f46093b;
                        bVar2.f46096d.b(g.FAILURE);
                        bVar2.N();
                        break;
                }
            }
        };
        final int i11 = 1;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: mj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f46093b;

            {
                this.f46093b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                switch (i11) {
                    case 0:
                        b bVar = this.f46093b;
                        bVar.f46096d.b(g.FAILURE);
                        bVar.N();
                        bVar.f46095c.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
                        break;
                    default:
                        b bVar2 = this.f46093b;
                        bVar2.f46096d.b(g.FAILURE);
                        bVar2.N();
                        break;
                }
            }
        };
        AlertDialog.Builder view = new AlertDialog.Builder(contextThemeWrapper).setView(viewInflate);
        h hVar = this.f46098f;
        view.setPositiveButton(hVar.f46138h, onClickListener).setNegativeButton(hVar.f46135e, onClickListener2).setCancelable(false).show();
    }

    public final void N() {
        o oVar = this.f46094b;
        if (oVar != null) {
            oVar.b(this);
        } else {
            this.f46095c.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(v vVar) {
        onActivityResumed(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void h(v vVar) {
        onActivityPaused(null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f46100h) {
            this.f46102j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f46100h) {
            this.f46102j = false;
            FragmentActivity fragmentActivity = this.f46095c;
            u uVar = this.f46101i;
            uVar.f11772b.post(new l2.u(9, this, new x(fragmentActivity, uVar, this)));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a(v vVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(v vVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(v vVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(v vVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
