package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import b2.o;
import com.ironsource.C0474n4;
import com.ironsource.C0654x5;
import com.ironsource.EnumC0443l9;
import com.ironsource.EnumC0672y5;
import com.ironsource.InterfaceC0362h;
import com.ironsource.Kb;
import com.ironsource.P9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import l1.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class InlineStoreActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f38453c = "InlineStoreActivity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38454d = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f38455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38456b = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f38457a = "inline_store_intent";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String f38458b = "destroy_inline_store";

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0362h f38459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f38460b;

        public b(InterfaceC0362h interfaceC0362h) {
            this.f38459a = interfaceC0362h;
        }

        public b a(Intent intent) {
            this.f38460b = intent;
            return this;
        }

        public Intent a(Context context) {
            Intent intentA = this.f38459a.a(context);
            intentA.putExtra("inline_store_intent", this.f38460b);
            return intentA;
        }
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1001) {
            v vVar = this.f38455a;
            if (vVar != null) {
                vVar.a(i11, this.f38456b);
            }
            HashMap map = new HashMap();
            String strE = d.e(i11, "resultCode:");
            if (this.f38456b) {
                strE = wi.d.h(strE, ",destroyCalled:true");
            }
            map.put(IronSourceConstants.EVENTS_EXT1, strE);
            a(EnumC0672y5.INLINE_STORE_CLOSED, map);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f38453c, "onCreate()");
        try {
            this.f38455a = (v) P9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            v vVar = this.f38455a;
            if (vVar != null) {
                vVar.j(e10.toString());
            }
            a(EnumC0672y5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v vVar = this.f38455a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.f38456b = true;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        v vVar = this.f38455a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void b() {
        requestWindowFeature(1);
    }

    private void a(Intent intent) {
        startActivityForResult(intent, 1001);
        v vVar = this.f38455a;
        if (vVar != null) {
            vVar.z();
        }
        a(EnumC0672y5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(EnumC0672y5 enumC0672y5, Map<String, Object> map) {
        new Thread(new o(26, map, enumC0672y5)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, EnumC0672y5 enumC0672y5) {
        try {
            HashMap map2 = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC0443l9.APP_ACTIVITY.b();
            Object obj = map2.get(IronSourceConstants.EVENTS_EXT1);
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                map2.put(IronSourceConstants.EVENTS_EXT1, str + "," + obj);
            } else {
                map2.put(IronSourceConstants.EVENTS_EXT1, str);
            }
            Kb.Y().q().a(new C0654x5(enumC0672y5, new JSONObject(map2)));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }
}
