package l7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.google.android.gms.internal.ads.aj0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j2.n f45113f = new j2.n(13);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f45114g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalBroadcastManager f45115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.i f45116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f45117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f45118d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f45119e = new Date(0);

    public f(LocalBroadcastManager localBroadcastManager, s4.i iVar) {
        this.f45115a = localBroadcastManager;
        this.f45116b = iVar;
    }

    public final void a() {
        a aVar = this.f45117c;
        if (aVar == null) {
            return;
        }
        String str = aVar.f45081k;
        final int i10 = 0;
        final int i11 = 1;
        if (this.f45118d.compareAndSet(false, true)) {
            this.f45119e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aj0 aj0Var = new aj0();
            final com.facebook.appevents.b bVar = new com.facebook.appevents.b(atomicBoolean, hashSet, hashSet2, hashSet3, 1);
            final b bVar2 = new b(aj0Var, i10);
            final com.applovin.impl.mediation.j jVar = new com.applovin.impl.mediation.j(aj0Var, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this, 2);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            String str2 = b0.f45085j;
            b0 b0VarZ = j2.n.z(aVar, "me/permissions", bVar);
            b0VarZ.f45090d = bundle;
            f0 f0Var = f0.f45120a;
            b0VarZ.f45094h = f0Var;
            e nVar = (str == null ? "facebook" : str).equals("instagram") ? new j2.n(14) : new jj.d(13);
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", nVar.f());
            bundle2.putString("client_id", aVar.f45078h);
            bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            b0 b0VarZ2 = j2.n.z(aVar, nVar.p(), bVar2);
            b0VarZ2.f45090d = bundle2;
            b0VarZ2.f45094h = f0Var;
            if (kotlin.jvm.internal.n.a(str, "gaming")) {
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                w wVar = new w() { // from class: l7.c
                    @Override // l7.w
                    public final void a(e0 e0Var) throws Throwable {
                        switch (i10) {
                            case 0:
                                ((com.facebook.appevents.b) bVar).a(e0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    jVar.run();
                                }
                                break;
                            default:
                                ((b) bVar).a(e0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    jVar.run();
                                }
                                break;
                        }
                    }
                };
                w wVar2 = new w() { // from class: l7.c
                    @Override // l7.w
                    public final void a(e0 e0Var) throws Throwable {
                        switch (i11) {
                            case 0:
                                ((com.facebook.appevents.b) bVar2).a(e0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    jVar.run();
                                }
                                break;
                            default:
                                ((b) bVar2).a(e0Var);
                                if (atomicInteger.incrementAndGet() == 2) {
                                    jVar.run();
                                }
                                break;
                        }
                    }
                };
                b0VarZ.j(wVar);
                b0VarZ2.j(wVar2);
                b0VarZ.d();
                b0VarZ2.d();
                return;
            }
            d0 d0Var = new d0(b0VarZ, b0VarZ2);
            d dVar = new d(jVar);
            ArrayList arrayList = d0Var.f45107d;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            q7.f.m(d0Var);
            new c0(d0Var).executeOnExecutor(s.d(), new Void[0]);
        }
    }

    public final void b(a aVar, a aVar2) {
        Intent intent = new Intent(s.b(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f45115a.sendBroadcast(intent);
    }

    public final void c(a aVar, boolean z10) {
        boolean zEquals;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f45116b.f50111a;
        a aVar2 = this.f45117c;
        String str = aVar2 != null ? aVar2.f45079i : null;
        String str2 = aVar != null ? aVar.f45079i : null;
        if (str != null && !str.equals(str2)) {
            s.d().execute(new com.applovin.impl.sdk.x(12));
        }
        this.f45117c = aVar;
        this.f45118d.set(false);
        this.f45119e = new Date(0L);
        if (z10) {
            if (aVar != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                q7.e0.c(s.b());
            }
        }
        if (aVar2 == null) {
            zEquals = aVar == null;
        } else {
            zEquals = aVar2.equals(aVar);
        }
        if (zEquals) {
            return;
        }
        b(aVar2, aVar);
        Context contextB = s.b();
        Date date = a.l;
        a aVarD = go.k.D();
        AlarmManager alarmManager = (AlarmManager) contextB.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (go.k.P()) {
            if ((aVarD != null ? aVarD.f45071a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextB, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, aVarD.f45071a.getTime(), PendingIntent.getBroadcast(contextB, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}
