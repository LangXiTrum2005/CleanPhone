package com.thinkup.core.common.n;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.Toast;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.thinkup.core.api.DeviceInfoCallback;
import com.thinkup.core.api.IDlHandler;
import com.thinkup.core.api.IExHandler;
import com.thinkup.core.api.IOdHandler;
import com.thinkup.core.api.IOsExHandler;
import com.thinkup.core.api.ITUAdFilter;
import com.thinkup.core.api.ITUDeviceRiskListener;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdFilter;
import com.thinkup.core.api.TUCommonConfig;
import com.thinkup.core.api.TUCustomAdapterConfig;
import com.thinkup.core.api.TUDebuggerConfig;
import com.thinkup.core.api.TUInitConfig;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUNetworkConfig;
import com.thinkup.core.api.TUOsDmEntity;
import com.thinkup.core.api.TUSharedPlacementConfig;
import com.thinkup.core.api.TUUserDeviceInfo;
import com.thinkup.core.common.om0;
import com.thinkup.core.common.on.o0no;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.oon;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.common.ooo.onm;
import com.thinkup.network.adx.AdxTUInitManager;
import com.thinkup.network.facebook.FacebookTUInitConfig;
import com.unity3d.services.core.fid.Constants;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0n {
    public static final int m = 1;
    private static volatile o0n mn;
    private static final Object nnn = new Object();
    public static final int o = 0;
    private int m0;
    private String m0n;
    private com.thinkup.core.common.mm.oo mmm;
    private Location mmn;
    private List<String> mnm;
    private JSONArray mno;
    private String mo0;
    private boolean mom;
    private Context n0;
    private String n00;
    private boolean n0m;
    private TUDebuggerConfig n0o;
    private String nm;
    private TUUserDeviceInfo nm0;
    private o0no nmo;
    private String nn0;
    private long nnm;
    private boolean nno;
    private String no;
    private ConcurrentHashMap<String, ITUAdFilter> nom;
    private TUNetworkConfig o00;
    private volatile com.thinkup.core.common.n0.n.mo o000;
    private com.thinkup.core.common.o0.m o00o;
    private String o0o;
    private Pair<Integer, List<String>> o0o0;
    private Pair<Boolean, com.thinkup.core.common.on.n0> o0oo;
    ITUDeviceRiskListener om;
    private String omm;
    private String omn;
    private BroadcastReceiver omo;
    WeakReference<Activity> on;
    private String on0;
    private o0m ono;
    private ConcurrentHashMap<String, TUCustomAdapterConfig> oo0;
    private String oom;
    private final String mo = "SDK.init";
    private boolean mm = false;
    private final Object om0 = new Object();
    private boolean onn = false;
    private boolean m00 = false;
    private long m0o = 0;
    private long m0m = 0;
    private boolean mon = false;
    private boolean mm0 = false;
    private final Object mmo = new Object();
    private String mn0 = "";
    private int n0n = 1;
    private boolean no0 = false;
    private boolean noo = false;
    private String non = "";
    private final Object nmn = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f41918n = false;
    boolean o0 = false;
    private long o00m = -1;
    long oo = 0;
    private int o00n = -1;
    private final List<n0> o0om = new ArrayList();
    private final Map<String, TUAdFilter> o0on = new HashMap();
    private Handler nn = new Handler(Looper.getMainLooper());
    private ConcurrentHashMap<String, Map<String, Object>> o0n = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Object> o0m = new ConcurrentHashMap<>();
    private final String onm = a.r(new StringBuilder(), File.separator, "thinkup.test");
    private boolean moo = true;
    private ConcurrentHashMap<String, List<String>> mnn = new ConcurrentHashMap<>();
    private JSONObject oon = new JSONObject();
    private long nmm = System.currentTimeMillis();
    private final Map<String, Boolean> ooo = new ConcurrentHashMap(2);

    /* JADX INFO: renamed from: com.thinkup.core.common.n.o0n$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ String m;
        final /* synthetic */ String o;

        public AnonymousClass1(String str, String str2) {
            this.o = str;
            this.m = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            onm.m(o0n.this.n0, oo0.m.o, oo0.o.m, this.o);
            onm.m(o0n.this.n0, oo0.m.o, oo0.o.f41932n, this.m);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.n.o0n$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {
        final /* synthetic */ Context m;
        final /* synthetic */ TUInitConfig o;

        public AnonymousClass10(TUInitConfig tUInitConfig, Context context) {
            this.o = tUInitConfig;
            this.m = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Map<String, Object> requestParamMap;
            boolean zN;
            boolean zO0;
            try {
                TUInitMediation initMediation = this.o.getInitMediation();
                if (initMediation != null) {
                    String networkName = initMediation.getNetworkName();
                    String strN = onm.n(o0n.this.n0, oo0.m.m0, networkName, "");
                    if (TextUtils.isEmpty(strN)) {
                        requestParamMap = this.o.getRequestParamMap();
                        requestParamMap.put(TUInitMediation.KEY_LOCAL, Boolean.TRUE);
                    } else {
                        requestParamMap = com.thinkup.core.common.ooo.o00.n(strN);
                    }
                    boolean z2 = false;
                    try {
                        zN = oom.o(this.m).n();
                        try {
                            zO0 = oom.o(this.m).o0();
                            try {
                                initMediation.setUserDataConsent(this.m, zN, zO0);
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            zO0 = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zN = false;
                        zO0 = false;
                    }
                    com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(this.m).m(o0n.this.no);
                    requestParamMap.put("app_ccpa_switch", Boolean.valueOf(mVarM.ooo() == 3));
                    boolean zM = com.thinkup.core.common.ooo.nn.m();
                    if (mVarM.oom() == 2 && zM) {
                        z2 = true;
                    }
                    requestParamMap.put("app_coppa_switch", Boolean.valueOf(z2));
                    if (o0n.m().m0o()) {
                        Log.i(mo.oo0, "pre init network: [" + networkName + "], params: " + new JSONObject(requestParamMap).toString() + ", gdpr: " + zN + ", in eu: " + zO0);
                    }
                    initMediation.initSDK(o0n.this.n0, requestParamMap, null);
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.n.o0n$11, reason: invalid class name */
    public class AnonymousClass11 implements Runnable {
        private AnonymousClass11() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0m o0mVarN = o0n.m().n();
            if (o0mVarN != null) {
                o0mVarN.startPlugin(o0n.this.n0);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.n.o0n$2, reason: invalid class name */
    public class AnonymousClass2 implements MediationInitCallback {
        final /* synthetic */ Context o;

        public AnonymousClass2(Context context) {
            this.o = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            o0n.this.o("There is a problem with the integrated resources of TU SDK, please check whether you have followed the steps of the integration document.", true, 3, str);
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            com.thinkup.core.o.m.m.o().o(this.o);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.n.o0n$4, reason: invalid class name */
    public class AnonymousClass4 extends BroadcastReceiver {
        public AnonymousClass4() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            o0n.o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.thinkup.core.common.ooo.o00.o(context)) {
                        com.thinkup.core.common.oo0.o().m();
                        com.thinkup.core.common.o0n.o().m();
                    }
                    com.thinkup.core.common.oo0.o0.o().m();
                    o0n.this.o(context, false);
                    if (TextUtils.equals(intent.getAction(), mo.omo)) {
                        com.thinkup.core.common.oo0.oo.o(intent.getStringExtra(mo.omm));
                    }
                }
            });
            try {
                if (o0n.this.ono != null) {
                    o0n.this.ono.resetSSID();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.n.o0n$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        final /* synthetic */ String m;
        final /* synthetic */ Context o;

        public AnonymousClass5(Context context, String str) {
            this.o = context;
            this.m = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(this.o.getApplicationContext()).m(this.m);
            if (mVarM != null) {
                if (!mVarM.mom()) {
                    com.thinkup.core.common.o0o.o(o0n.this.n0).o(mVarM);
                    com.thinkup.core.common.m.m.o().o(mVarM.o0mm());
                    com.thinkup.core.common.n.o().m(mVarM.mm());
                    com.thinkup.core.m.m.o(this.o.getApplicationContext()).o(mVarM.o0nm());
                    o0n.m().m0n();
                    o0n.m().o(mVarM);
                    com.thinkup.core.common.ooo.oo.o().o(mVarM.on());
                    o0m o0mVarN = o0n.this.n();
                    if (o0mVarN != null) {
                        o0mVarN.uploadAegisData(mVarM);
                    }
                }
                oon.o().o(mVarM.m0());
                if (!com.thinkup.core.oo.o0.o(this.o.getApplicationContext()).o(this.m)) {
                    com.thinkup.core.oo.o0.o(this.o.getApplicationContext());
                }
                com.thinkup.core.common.nm.oo.o().o(mVarM);
            }
        }
    }

    private o0n() {
    }

    public static o0n m() {
        if (mn == null) {
            synchronized (o0n.class) {
                try {
                    if (mn == null) {
                        mn = new o0n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mn;
    }

    public static com.thinkup.core.common.mm.oo m0m() {
        return new com.thinkup.core.common.o00.oo();
    }

    private void nm0() {
        if (this.o00m == -1) {
            long jM = onm.m(this.n0, oo0.m.o, "SPU_UPDATE_6450_TIME_KEY", 0L);
            this.o00m = jM;
            if (jM == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.o00m = jCurrentTimeMillis;
                onm.o(this.n0, oo0.m.o, "SPU_UPDATE_6450_TIME_KEY", jCurrentTimeMillis);
            }
        }
    }

    private static boolean nmm() {
        return omo();
    }

    private void nmn() {
        try {
            BroadcastReceiver broadcastReceiver = this.omo;
            if (broadcastReceiver != null) {
                this.n0.unregisterReceiver(broadcastReceiver);
                no.o(this.n0).o(this.omo);
            }
            this.omo = null;
        } catch (Throwable unused) {
        }
        try {
            this.omo = new AnonymousClass4();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction(mo.omo);
            this.n0.registerReceiver(this.omo, intentFilter);
            no.o(this.n0).o(this.omo, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    private void nmo() {
        com.thinkup.core.common.o0.o.o();
        com.thinkup.core.common.o0.m mVarO = com.thinkup.core.common.o0.o.o(this.n0);
        if (mVarO != null) {
            o(mVarO.m(), false, mVarO.o(), mVarO.n());
        }
    }

    private void nn0() {
        boolean zExists = false;
        if (this.n0 != null) {
            try {
                zExists = new File(this.n0.getExternalFilesDir(null), this.onm).exists();
                if (!zExists) {
                    zExists = new File(this.n0.getFilesDir(), this.onm).exists();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.onn = zExists;
    }

    private long nnm() {
        return this.nmm;
    }

    private static boolean nnn() {
        return false;
    }

    private boolean nno() {
        return this.moo;
    }

    private static boolean o000() {
        return true;
    }

    private String om0(String str) {
        synchronized (this.om0) {
            try {
                String strOptString = this.oon.optString(str);
                if (!TextUtils.isEmpty(strOptString)) {
                    return strOptString;
                }
                String strOno = ono();
                String string = "";
                if (TextUtils.isEmpty(strOno)) {
                    strOno = com.thinkup.core.common.ooo.n0.o0(this.n0) + com.thinkup.core.common.ooo.n0.om();
                    StringBuilder sb = new StringBuilder();
                    sb.append(new Random().nextInt(10000000));
                    string = sb.toString();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strO = com.thinkup.core.common.ooo.nm.o(strOno + str + string + jCurrentTimeMillis);
                try {
                    this.oon.put(str, strO);
                } catch (Exception unused) {
                }
                onm.m(this.n0, oo0.m.o, "SPU_SESSIONID_KEY", this.oon.toString());
                if (!TextUtils.isEmpty(ono())) {
                    string = null;
                }
                com.thinkup.core.common.oo0.oo.o(str, "2", string, String.valueOf(jCurrentTimeMillis));
                return strO;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean omo() {
        return !m.n().m();
    }

    private Map<String, Object> oom(String str) {
        if (this.o0n == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.o0n.get(str);
    }

    public final int m00() {
        return this.o00n;
    }

    public final void m0n() {
        com.thinkup.core.common.on.n0 n0Var;
        try {
            if (this.o0o0 != null) {
                if (this.n0 == null || TextUtils.isEmpty(this.no)) {
                    com.thinkup.core.common.on.n0 n0Var2 = new com.thinkup.core.common.on.n0();
                    n0Var2.mm0(((Integer) this.o0o0.first).intValue());
                    Object obj = this.o0o0.second;
                    if (obj != null) {
                        n0Var2.omo(((List) obj).toString());
                    }
                    this.o0oo = new Pair<>(Boolean.FALSE, n0Var2);
                    return;
                }
                com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(this.n0).m(this.no);
                if (mVarM == null) {
                    com.thinkup.core.common.on.n0 n0Var3 = new com.thinkup.core.common.on.n0();
                    n0Var3.mm0(((Integer) this.o0o0.first).intValue());
                    Object obj2 = this.o0o0.second;
                    if (obj2 != null) {
                        n0Var3.omo(((List) obj2).toString());
                    }
                    this.o0oo = new Pair<>(Boolean.FALSE, n0Var3);
                    return;
                }
                if (mVarM.oo() == 1) {
                    Pair<Boolean, com.thinkup.core.common.on.n0> pair = this.o0oo;
                    if (pair == null || ((Boolean) pair.first).booleanValue()) {
                        n0Var = new com.thinkup.core.common.on.n0();
                        n0Var.mm0(((Integer) this.o0o0.first).intValue());
                        Object obj3 = this.o0o0.second;
                        if (obj3 != null) {
                            n0Var.omo(((List) obj3).toString());
                        }
                    } else {
                        n0Var = (com.thinkup.core.common.on.n0) this.o0oo.second;
                        this.o0oo = null;
                    }
                    com.thinkup.core.common.oo0.n.o(m().n0).o(27, n0Var);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean m0o() {
        return this.onn || this.m00;
    }

    public final int mm() {
        return this.m0;
    }

    public final Context mm0() {
        WeakReference<Activity> weakReference = this.on;
        return (weakReference == null || weakReference.get() == null) ? this.n0 : this.on.get();
    }

    public final String mmm() {
        return this.non;
    }

    public final boolean mmn() {
        return this.mon;
    }

    public final Activity mmo() {
        WeakReference<Activity> weakReference = this.on;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.on.get();
    }

    public final List<String> mn() {
        return this.mnm;
    }

    public final TUUserDeviceInfo mn0() {
        return this.nm0;
    }

    public final void mnm() {
        this.nmm = System.currentTimeMillis();
    }

    public final void mnn() {
        Context context = this.n0;
        if (context == null || this.mm0) {
            return;
        }
        synchronized (this.mmo) {
            try {
                if (!this.mm0) {
                    long jM = onm.m(context, oo0.m.o, oo0.o.omo, 0L);
                    this.m0o = jM;
                    if (jM == 0) {
                        long j = this.nnm;
                        this.m0o = j;
                        onm.o(context, oo0.m.o, oo0.o.omo, j);
                    }
                    this.m0m = ((o(this.nnm) - o(this.m0o)) / 86400000) + 1;
                    com.thinkup.core.common.om.n.o().o(context);
                    this.mm0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o0no mno() {
        if (this.nmo == null) {
            this.nmo = new o0no();
        }
        try {
            this.nmo.o(com.thinkup.core.common.ooo.n0.o0m(m().n0));
            this.nmo.m(com.thinkup.core.common.ooo.n0.n0());
            this.nmo.n(com.thinkup.core.common.ooo.n0.nm());
            this.nmo.o0(com.thinkup.core.common.ooo.n0.m(com.thinkup.core.common.ooo.n0.no()));
        } catch (Throwable unused) {
        }
        return this.nmo;
    }

    public final Pair<Integer, List<String>> mo0() {
        return this.o0o0;
    }

    public final boolean mom() {
        return this.no0;
    }

    public final boolean mon() {
        return this.noo;
    }

    public final List<String> moo() {
        return this.mnn.get("forbid_network_firm_list");
    }

    public final o0m n() {
        IExHandler iExHandler;
        IDlHandler iDlHandler;
        IOdHandler iOdHandler;
        if (this.mm) {
            return this.ono;
        }
        synchronized (this.nmn) {
            if (this.mm) {
                return this.ono;
            }
            IOsExHandler iOsExHandler = null;
            try {
                iExHandler = (IExHandler) o((Class<?>) IExHandler.class, "");
            } catch (Throwable unused) {
                iExHandler = null;
            }
            try {
                iDlHandler = (IDlHandler) o((Class<?>) IDlHandler.class, mo.on.f41906n);
            } catch (Throwable unused2) {
                iDlHandler = null;
            }
            try {
                iOdHandler = (IOdHandler) o((Class<?>) IOdHandler.class, mo.on.o0);
            } catch (Throwable unused3) {
                iOdHandler = null;
            }
            try {
                iOsExHandler = (IOsExHandler) o((Class<?>) IOsExHandler.class, mo.on.oo);
            } catch (Throwable unused4) {
            }
            if (iExHandler != null || iDlHandler != null || iOdHandler != null || iOsExHandler != null) {
                Objects.toString(iExHandler);
                Objects.toString(iDlHandler);
                Objects.toString(iOdHandler);
                Objects.toString(iOsExHandler);
                this.ono = new o0m(iExHandler, iDlHandler, iOdHandler, iOsExHandler);
            }
            this.mm = true;
            return this.ono;
        }
    }

    public final JSONArray n0() {
        return this.mno;
    }

    public final String n00() {
        return this.nn0;
    }

    public final boolean n0m() {
        return this.nno;
    }

    public final com.thinkup.core.common.n0.n.mo n0n() {
        if (this.o000 == null) {
            synchronized (nnn) {
                try {
                    if (this.o000 == null) {
                        this.o000 = new com.thinkup.core.common.n0.n.on(this.n0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.o000;
    }

    public final boolean n0o() {
        return this.o0;
    }

    public final String nm() {
        Object obj = this.o0m.get("channel");
        return obj != null ? obj.toString() : "";
    }

    public final String nn() {
        Object obj = this.o0m.get("sub_channel");
        return obj != null ? obj.toString() : "";
    }

    public final Map<String, Object> no() {
        return this.o0m;
    }

    public final long no0() {
        return this.nnm;
    }

    public final Map<String, TUAdFilter> nom() {
        return this.o0on;
    }

    public final void non() {
        this.o0on.clear();
    }

    public final int noo() {
        try {
            TUOsDmEntity osDmEntity = n().getOsDmEntity();
            if (osDmEntity != null) {
                return Integer.parseInt(osDmEntity.getTrafficType());
            }
            return 8;
        } catch (Throwable unused) {
            return 8;
        }
    }

    public final String o0() {
        return this.o0o;
    }

    public final String o00() {
        if (TextUtils.isEmpty(this.no)) {
            this.no = onm.n(this.n0, oo0.m.o, oo0.o.m, "");
        }
        return this.no;
    }

    public final String o0m() {
        try {
            if (TextUtils.isEmpty(this.oom)) {
                o(this.n0, o00(), 0);
            }
        } catch (Exception unused) {
        }
        return this.oom;
    }

    public final boolean o0n() {
        return "1".equals(this.mn0);
    }

    public final String o0o() {
        if (TextUtils.isEmpty(this.nm)) {
            this.nm = onm.n(this.n0, oo0.m.o, oo0.o.f41932n, "");
        }
        return this.nm;
    }

    public final boolean omm() {
        return this.n0m;
    }

    public final boolean omn() {
        return this.n0m && this.n0o != null;
    }

    public final TUDebuggerConfig on0() {
        return this.n0o;
    }

    public final String onm() {
        if (TextUtils.isEmpty(this.omn)) {
            this.omn = onm.n(this.n0, "exc_log", "exc_sys", "");
        }
        return this.omn;
    }

    public final String onn() {
        if (TextUtils.isEmpty(this.on0)) {
            this.on0 = onm.n(this.n0, "exc_log", "exc_bk", "");
        }
        return this.on0;
    }

    public final String ono() {
        if (TextUtils.isEmpty(this.omm)) {
            String strN = onm.n(this.n0, oo0.m.o, "UP_ID", "");
            this.omm = strN;
            TextUtils.isEmpty(strN);
        }
        return this.omm;
    }

    public final Location oo0() {
        return this.mmn;
    }

    public final boolean oon() {
        Context context = this.n0;
        if (context != null) {
            if (this.o00m == -1) {
                this.o00m = onm.m(context, oo0.m.o, "SPU_UPDATE_6450_TIME_KEY", 0L);
            }
            if (this.o00m != 0 && System.currentTimeMillis() - this.o00m > 86400000) {
                return true;
            }
        }
        return false;
    }

    public final String ooo() {
        return this.mn0;
    }

    private void mm(Context context) {
        o(context, false);
    }

    private static void omm(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(mo.oo0, "AdSourceId is empty");
            return;
        }
        try {
            if (Long.parseLong(str) == 0) {
                Log.e(mo.oo0, "AdSourceId can't set 0");
            }
        } catch (Exception unused) {
            Log.e(mo.oo0, "AdSourceId '" + str + "' is not compliant");
        }
    }

    private static boolean omo(String str) {
        String strO = com.thinkup.core.common.ooo.nn.o();
        boolean z2 = !TextUtils.isEmpty(str) && str.startsWith(strO);
        if (z2) {
            Log.i(mo.oo0, "Adapter Version: VERIFIED");
            return z2;
        }
        Log.e(mo.oo0, androidx.datastore.preferences.protobuf.a.n("Adapter Version: The current Adapter version(", str, ") does not apply to the SDK version(", strO, ")."));
        return z2;
    }

    public static /* synthetic */ boolean ooo(String str) {
        String strO = com.thinkup.core.common.ooo.nn.o();
        boolean z2 = !TextUtils.isEmpty(str) && str.startsWith(strO);
        if (z2) {
            Log.i(mo.oo0, "Adapter Version: VERIFIED");
            return z2;
        }
        Log.e(mo.oo0, androidx.datastore.preferences.protobuf.a.n("Adapter Version: The current Adapter version(", str, ") does not apply to the SDK version(", strO, ")."));
        return z2;
    }

    public final long m0() {
        return this.m0o;
    }

    public final void mn(String str) {
        this.on0 = str;
        onm.m(this.n0, "exc_log", "exc_bk", str);
    }

    public final long mo() {
        return this.m0m;
    }

    public final void n0(String str) {
        onm.m(this.n0, oo0.m.o, "UP_ID", str);
        this.omm = str;
    }

    public final List<String> no(String str) {
        return this.mnn.get(str);
    }

    public final Map<String, Object> o0(String str) {
        Object obj;
        Object obj2;
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.o0n.get(str);
        ConcurrentHashMap<String, Object> concurrentHashMap = this.o0m;
        if (concurrentHashMap != null) {
            com.thinkup.core.common.ooo.mo.o(map, concurrentHashMap);
        }
        if (map2 != null) {
            com.thinkup.core.common.ooo.mo.o(map, map2);
        }
        map.remove("channel");
        map.remove("sub_channel");
        if (map2 != null) {
            obj = map2.get("channel");
            obj2 = map2.get("sub_channel");
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj == null) {
            obj = this.o0m.get("channel");
        }
        if (obj2 == null) {
            obj2 = this.o0m.get("sub_channel");
        }
        if (obj != null) {
            map.put("channel", obj);
        }
        if (obj2 != null) {
            map.put("sub_channel", obj2);
        }
        return map;
    }

    public final void o0n(String str) {
        if (m0o()) {
            Log.i(mo.oo0, "setBundleName: ".concat(String.valueOf(str)));
        }
        this.nn0 = str;
    }

    public final String[] om() {
        synchronized (this.ooo) {
            Set<String> setKeySet = this.ooo.keySet();
            int size = setKeySet.size();
            if (size <= 0) {
                return null;
            }
            String[] strArr = new String[size];
            setKeySet.toArray(strArr);
            return strArr;
        }
    }

    public final Context on() {
        return this.n0;
    }

    public final int oo() {
        return this.n0n;
    }

    public final void oo0(String str) {
        if (TextUtils.isEmpty(str) || this.o0on.isEmpty()) {
            return;
        }
        this.o0on.remove(str);
    }

    private boolean m0(Context context) {
        String strO0 = com.thinkup.core.common.ooo.n0.o0(context);
        if (!TextUtils.isEmpty(strO0) && strO0.equals(this.n00)) {
            return true;
        }
        String strOm = com.thinkup.core.common.ooo.n0.om();
        if (!TextUtils.isEmpty(strOm) && strOm.equals(this.n00)) {
            return true;
        }
        o0m o0mVarN = m().n();
        return o0mVarN != null && o0mVarN.checkDebuggerDevice(context, this.n00);
    }

    private void mo(Context context) {
        long jCurrentTimeMillis = this.oo;
        try {
            String strN = onm.n(m().n0, oo0.m.o, m().o00() + "playRecord", "");
            if (!TextUtils.isEmpty(strN)) {
                JSONObject jSONObject = new JSONObject(strN);
                long jOptLong = jSONObject.optLong("start_time");
                long jOptLong2 = jSONObject.optLong("end_time");
                String strOptString = jSONObject.optString("psid");
                int iOptInt = jSONObject.optInt("launch_mode");
                if (jCurrentTimeMillis != 0) {
                    com.thinkup.core.common.oo0.oo.o(iOptInt == 1 ? 4 : 2, jOptLong, jOptLong2, strOptString);
                } else {
                    jCurrentTimeMillis = jOptLong;
                }
                onm.m(m().n0, oo0.m.o, m().o00() + "playRecord", "");
            }
        } catch (Exception unused) {
            onm.m(m().n0, oo0.m.o, m().o00() + "playRecord", "");
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = onm.m(context, oo0.m.o, "SPU_INIT_TIME_KEY", 0L);
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        m.n().o(new om(jCurrentTimeMillis));
    }

    public final void mm(String str) {
        this.omn = str;
        onm.m(this.n0, "exc_log", "exc_sys", str);
    }

    public final List<String> nm(String str) {
        return this.mnn.get(str + "_network_firm");
    }

    public final List<String> nn(String str) {
        return this.mnn.get(str + "_network_firm_a_s");
    }

    public final boolean o() {
        return this.mom;
    }

    public final String on(String str) {
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        synchronized (this.om0) {
            strOptString = this.oon.optString(str);
        }
        return TextUtils.isEmpty(strOptString) ? om0(str) : strOptString;
    }

    public final void oo(String str) {
        this.m0n = str;
        this.o0m.put("channel", str);
    }

    public final void oom() {
        try {
            com.thinkup.core.common.ooo.n0.o(this.n0);
            com.thinkup.core.common.ooo.n0.o00(this.n0);
        } catch (Exception unused) {
        }
        if (m0o()) {
            String strO0 = com.thinkup.core.common.ooo.n0.o0(this.n0);
            Log.i(mo.oo0, "********************************** " + com.thinkup.core.common.ooo.nn.o() + " *************************************");
            Log.i(mo.oo0, "GAID(ADID): " + com.thinkup.core.common.ooo.n0.o0o(this.n0) + " , AndroidID: " + strO0 + ", OAID: " + com.thinkup.core.common.ooo.n0.m0o());
            StringBuilder sb = new StringBuilder("********************************** ");
            sb.append(com.thinkup.core.common.ooo.nn.o());
            sb.append(" *************************************");
            Log.i(mo.oo0, sb.toString());
            if (TextUtils.isEmpty(strO0)) {
                return;
            }
            Log.i(mo.oo0, "You can use \"TUSDK.setDebuggerConfig(context, \"" + strO0 + "\",new TUDebuggerConfig.Builder(the NetworkFirmId you want to test).build());\" to open the debugger mode.");
        }
    }

    private static void mn(Context context) {
        com.thinkup.core.common.om.n.o().o(context);
    }

    private void n0(Context context) {
        long jM = onm.m(context, oo0.m.o, oo0.o.omo, 0L);
        this.m0o = jM;
        if (jM == 0) {
            long j = this.nnm;
            this.m0o = j;
            onm.o(context, oo0.m.o, oo0.o.omo, j);
        }
        this.m0m = ((o(this.nnm) - o(this.m0o)) / 86400000) + 1;
    }

    private static Object o(Class<?> cls, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    public final List<String> o00(String str) {
        return this.mnn.get(str + "_network_firm_f_s");
    }

    public final ITUAdFilter o0o(String str) {
        ConcurrentHashMap<String, ITUAdFilter> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.nom) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    private synchronized void oo(final Context context) {
        if (context == null) {
            return;
        }
        this.n0 = context.getApplicationContext();
        if (!TextUtils.isEmpty(this.no) && !TextUtils.isEmpty(this.nm)) {
            if (this.mom) {
                return;
            }
            this.mom = true;
            try {
                final Context applicationContext = context.getApplicationContext();
                this.no0 = com.thinkup.core.common.ooo.o00.o();
                try {
                    BroadcastReceiver broadcastReceiver = this.omo;
                    if (broadcastReceiver != null) {
                        this.n0.unregisterReceiver(broadcastReceiver);
                        no.o(this.n0).o(this.omo);
                    }
                    this.omo = null;
                } catch (Throwable unused) {
                }
                try {
                    this.omo = new AnonymousClass4();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction(mo.omo);
                    this.n0.registerReceiver(this.omo, intentFilter);
                    no.o(this.n0).o(this.omo, intentFilter);
                } catch (Throwable unused2) {
                }
                o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.13
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            o0n.this.mnn();
                            com.thinkup.core.common.oo0.o0.o().o(applicationContext);
                            o0n o0nVar = o0n.this;
                            o0nVar.o(applicationContext, o0nVar.no, 0);
                            o0n.o(o0n.this, context);
                            mm.o(applicationContext).o();
                            com.thinkup.core.common.o.nn.o().m();
                            com.thinkup.core.common.mo.n.o().o(context);
                            com.thinkup.core.common.res.o0.o(o0n.this.on()).m();
                            com.thinkup.core.common.res.o0.o(o0n.this.on());
                            com.thinkup.core.common.res.o0.n();
                            com.thinkup.core.common.o.om.o();
                        } catch (Exception unused3) {
                        }
                    }
                });
                o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.14
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0n.this.oom();
                        o0n.o0(applicationContext);
                        o0n o0nVar = o0n.this;
                        o0n.m(o0nVar, o0nVar.n0);
                    }
                });
                o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.15
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.thinkup.core.common.nn.o().o(o0n.this.n0);
                    }
                });
                m.n().o(new on(omo()));
                o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.16
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0n.this.n();
                        if (o0n.this.ono != null) {
                            o0n.this.ono.initDeviceInfo(context);
                            o0n.this.ono.cleanExpiredInfo();
                        }
                        com.thinkup.core.oo.nm.o(applicationContext).o();
                        om0.o(context);
                        com.thinkup.core.common.o0.o().o(context);
                        if (TextUtils.isEmpty(o0n.this.n00)) {
                            return;
                        }
                        String strO0o = com.thinkup.core.common.ooo.n0.o0o(o0n.this.n0);
                        if (TextUtils.isEmpty(strO0o)) {
                            return;
                        }
                        o0n.this.m0(strO0o);
                    }
                });
                o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.17
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0n o0nVar = o0n.this;
                        o0n.o(o0nVar, o0nVar.n0, o0n.this.o00);
                    }
                });
                String str = this.no;
                o(context.getApplicationContext(), false);
                o(new AnonymousClass5(context, str));
            } catch (Exception e2) {
                Log.e("SDK.init", "init failed: " + e2.getMessage());
            }
            o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.18
                @Override // java.lang.Runnable
                public final void run() {
                    com.thinkup.core.common.oo0.o().m();
                }
            });
        }
    }

    public final void o0m(String str) {
        this.non = str;
    }

    @Deprecated
    private void oon(String str) {
        this.n00 = str;
    }

    public final TUCustomAdapterConfig m(String str) {
        if (this.oo0 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.oo0.get(str);
    }

    private void m(String str, String str2) {
        this.no = str;
        this.nm = str2;
        m();
        o(new AnonymousClass1(str, str2));
    }

    public final void o(String str) {
        this.o0o = str;
    }

    public final void om(String str) {
        this.mo0 = str;
        this.o0m.put("sub_channel", str);
    }

    private void on(Context context) {
        try {
            com.thinkup.core.common.o0.m mVar = this.o00o;
            if (mVar != null) {
                com.thinkup.core.common.oo0.oo.o(mVar);
                return;
            }
            Object objInvoke = null;
            try {
                objInvoke = AdxTUInitManager.class.getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
            if (objInvoke instanceof TUInitMediation) {
                TUInitMediation tUInitMediation = (TUInitMediation) objInvoke;
                HashMap map = new HashMap();
                map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PRECHECK_MODE, 1);
                com.thinkup.core.o.o.o oVar = new com.thinkup.core.o.o.o();
                oVar.o();
                oVar.o(com.thinkup.core.common.ooo.nn.o());
                oVar.m(o00());
                oVar.n(o0o());
                map.put("sdm_app_data", com.thinkup.core.o.n.o(oVar));
                com.thinkup.core.o.o.oo ooVar = new com.thinkup.core.o.o.oo();
                ooVar.o(ono());
                ooVar.on(com.thinkup.core.common.ooo.n0.o0(context));
                ooVar.n(com.thinkup.core.common.ooo.n0.o0o(context));
                ooVar.oo(com.thinkup.core.common.ooo.n0.m0m());
                ooVar.om(com.thinkup.core.common.ooo.n0.m0n());
                map.put("sdm_device_data", com.thinkup.core.o.n.o(ooVar));
                String[] strArrOm = om();
                if (strArrOm != null && strArrOm.length > 0) {
                    map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO, strArrOm);
                }
                tUInitMediation.initSDK(context, map, new AnonymousClass2(context));
            }
        } catch (Throwable unused2) {
        }
    }

    public final void m0(String str) {
        if (TextUtils.isEmpty(this.n00)) {
            return;
        }
        if (TextUtils.equals(str, this.n00)) {
            this.n0m = true;
        }
        if (this.n0m && m0o()) {
            Log.i("SDK.init", "Update Setting Debugger's device success.");
        }
    }

    public final synchronized void o(String str, TUCustomAdapterConfig tUCustomAdapterConfig) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.oo0 == null) {
                this.oo0 = new ConcurrentHashMap<>();
            }
            if (tUCustomAdapterConfig == null) {
                this.oo0.remove(str);
            } else {
                this.oo0.put(str, tUCustomAdapterConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void om(Context context) {
        if (m().n("ua")) {
            return;
        }
        try {
            if (oom.o(context).m()) {
                String strMo = com.thinkup.core.common.ooo.n0.mo();
                String strN = onm.n(context, oo0.m.o, "local_os", "");
                if (TextUtils.isEmpty(strMo) || !Build.VERSION.RELEASE.equals(strN)) {
                    com.thinkup.core.common.ooo.n0.nn(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void m(int i2) {
        this.m0 = i2;
    }

    private void m(Context context, String str) {
        o(context.getApplicationContext(), false);
        o(new AnonymousClass5(context, str));
    }

    public static boolean o0(Context context, List<String> list) {
        boolean z2 = true;
        if (list == null || list.size() == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = list.get(i2);
                if (TextUtils.isEmpty(applicationInfo.metaData.getString(str))) {
                    sb.append(", \"");
                    sb.append(str);
                    sb.append("\"");
                    z2 = false;
                }
            }
            if (sb.length() > 2) {
                sb.delete(0, 2);
            }
            z3 = z2;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z3) {
            Log.i(mo.oo0, "meta-data: VERIFIED");
        } else {
            Log.e(mo.oo0, "meta-data: Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z3;
    }

    public final boolean n(String str) {
        boolean zContainsKey;
        synchronized (this.ooo) {
            zContainsKey = this.ooo.containsKey(str);
        }
        return zContainsKey;
    }

    public final void m(final Context context) {
        if (m0o()) {
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.n.o0n.6
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOoo;
                    AnonymousClass6 anonymousClass6 = this;
                    try {
                        ArrayList arrayList = new ArrayList();
                        Enumeration<String> enumerationEntries = new DexFile(context.getPackageCodePath()).entries();
                        while (enumerationEntries.hasMoreElements()) {
                            String strNextElement = enumerationEntries.nextElement();
                            if (strNextElement.contains("com.thinkup.network") && strNextElement.contains("InitManager") && !strNextElement.contains("$")) {
                                arrayList.add(strNextElement);
                            }
                        }
                        Log.i(mo.oo0, "********************************** Network Integration Status *************************************");
                        if (arrayList.size() != 0) {
                            Log.i(mo.oo0, "----------------------------------------");
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                Class<?> cls = Class.forName((String) it.next());
                                Object objInvoke = null;
                                try {
                                    objInvoke = cls.getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
                                } catch (Throwable unused) {
                                    Log.e(mo.oo0, "Cannot instantiate " + cls.getName() + ", please check if a third-party SDK is imported");
                                    Log.i(mo.oo0, "----------------------------------------");
                                }
                                if (objInvoke != null && (objInvoke instanceof TUInitMediation)) {
                                    TUInitMediation tUInitMediation = (TUInitMediation) objInvoke;
                                    String networkName = tUInitMediation.getNetworkName();
                                    if (!TextUtils.isEmpty(networkName)) {
                                        String networkVersion = tUInitMediation.getNetworkVersion();
                                        if (TextUtils.isEmpty(networkVersion)) {
                                            Log.i(mo.oo0, "NetworkName: ".concat(String.valueOf(networkName)));
                                        } else {
                                            Log.i(mo.oo0, "NetworkName: " + networkName + "  (v" + networkVersion + ")");
                                        }
                                        boolean zMo = o0n.mo(tUInitMediation.getNetworkSDKClass());
                                        boolean zM = o0n.m(tUInitMediation.getPluginClassStatus());
                                        boolean zO = o0n.o(context, (List<String>) tUInitMediation.getActivityStatus());
                                        boolean zM2 = o0n.m(context, (List<String>) tUInitMediation.getServiceStatus());
                                        boolean zN = o0n.n(context, (List<String>) tUInitMediation.getProviderStatus());
                                        boolean zO0 = o0n.o0(context, (List<String>) tUInitMediation.getMetaValutStatus());
                                        boolean zOo = o0n.oo(context, tUInitMediation.getPermissionStatus());
                                        String strO = o0n.this.o(context, tUInitMediation.getResourceStatus(), tUInitMediation.getDevBundleName());
                                        boolean zIsEmpty = TextUtils.isEmpty(strO);
                                        if (zIsEmpty) {
                                            Log.i(mo.oo0, "Resource: VERIFIED");
                                        } else {
                                            Log.e(mo.oo0, "Resource: The " + strO + " resources are missing. If shrinkResources is enabled, the " + strO + " resources must be added to the whitelist (keep.xml)");
                                        }
                                        try {
                                            zOoo = tUInitMediation.needCheckAdapterVersion() ? o0n.ooo(tUInitMediation.getAdapterVersion()) : true;
                                        } catch (Throwable unused2) {
                                        }
                                        if (zMo && zM && zO && zM2 && zN && zO0 && zOo && zIsEmpty && zOoo) {
                                            Log.i(mo.oo0, "Status: Success");
                                        } else {
                                            Log.e(mo.oo0, "Status: Fail");
                                        }
                                        Log.i(mo.oo0, "----------------------------------------");
                                    }
                                }
                            } catch (Throwable unused3) {
                            }
                            anonymousClass6 = this;
                        }
                        Log.i(mo.oo0, "********************************** Network Integration Status *************************************");
                    } catch (Exception unused4) {
                    }
                }
            }, 2);
        }
    }

    public final void om0() {
        if (!this.o0) {
            Log.e(mo.oo0, "Please exec TUSDK.init before TUSDK.start");
        } else {
            oo(this.n0);
        }
    }

    public static boolean n(Context context, List<String> list) {
        PackageInfo packageInfo;
        boolean z2 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
        } catch (Throwable th) {
            sb.append(", error: ");
            sb.append(th.getMessage());
            packageInfo = null;
            z2 = false;
        }
        if (packageInfo == null) {
            return false;
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        for (String str : list) {
            int length = providerInfoArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (TextUtils.equals(providerInfoArr[i2].name, str)) {
                        break;
                    }
                    i2++;
                } else {
                    sb.append(", ");
                    sb.append(str);
                    z2 = false;
                    break;
                }
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z2) {
            Log.i(mo.oo0, "Providers : VERIFIED");
        } else {
            Log.e(mo.oo0, "Providers : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z2;
    }

    private void om(boolean z2) {
        this.no0 = z2;
    }

    public static boolean m(Map<String, Boolean> map) {
        boolean z2 = true;
        if (map == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (!map.get(str).booleanValue()) {
                sb.append(", ");
                sb.append(str);
                z2 = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z2) {
            Log.i(mo.oo0, "Dependence Plugin: VERIFIED");
            return z2;
        }
        Log.e(mo.oo0, "Dependence Plugin: Missing ".concat(String.valueOf(sb)));
        return z2;
    }

    public final void o(int i2) {
        if (i2 == 2) {
            this.n0n = 2;
        } else {
            this.n0n = 1;
        }
    }

    public final void o(String... strArr) {
        synchronized (this.ooo) {
            try {
                if (strArr != null) {
                    for (String str : strArr) {
                        this.ooo.put(str, Boolean.TRUE);
                    }
                } else {
                    this.ooo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean mo(String str) {
        try {
            Class.forName(str);
            Log.i(mo.oo0, "SDK: VERIFIED");
            return true;
        } catch (Throwable unused) {
            Log.i(mo.oo0, "SDK: NOT VERIFIED");
            return false;
        }
    }

    public final void o(Context context) {
        if (context == null) {
            Log.w("SDK.init", "TUSDK.setContext() is null!");
        } else {
            this.n0 = context;
        }
    }

    public static boolean m(Context context, List<String> list) {
        boolean z2 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
                if (packageManager.queryIntentServices(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                    sb.append(", ");
                    sb.append(str);
                    z2 = false;
                }
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z2) {
            Log.i(mo.oo0, "Services : VERIFIED");
        } else {
            Log.e(mo.oo0, "Services : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z2;
    }

    public final void o(Map<String, Object> map) {
        String string;
        String string2 = "";
        if (map != null && map.containsKey("channel")) {
            Object obj = map.get("channel");
            if (obj == null) {
                string = "";
            } else {
                string = obj.toString();
            }
            this.m0n = string;
            if (!com.thinkup.core.common.ooo.nn.o(string)) {
                this.m0n = null;
                map.remove("channel");
            }
        }
        if (map != null && map.containsKey("sub_channel")) {
            Object obj2 = map.get("sub_channel");
            if (obj2 != null) {
                string2 = obj2.toString();
            }
            this.mo0 = string2;
            if (!com.thinkup.core.common.ooo.nn.m(string2)) {
                this.mo0 = null;
                map.remove("sub_channel");
            }
        }
        this.o0m.clear();
        if (map != null) {
            com.thinkup.core.common.ooo.mo.o(this.o0m, map);
        }
        if (!TextUtils.isEmpty(this.m0n)) {
            this.o0m.put("channel", this.m0n);
        }
        if (TextUtils.isEmpty(this.mo0)) {
            return;
        }
        this.o0m.put("sub_channel", this.mo0);
    }

    public static void n(Runnable runnable) {
        com.thinkup.core.common.ooo.m.m.o().m(runnable, 2);
    }

    public final void o0(Runnable runnable) {
        this.nn.removeCallbacks(runnable);
    }

    public final void n(int i2) {
        this.o00n = i2;
    }

    public final void o0(String str, List<String> list) {
        if (m0o()) {
            Log.i(mo.oo0, String.format("setForbidShowNetworkFirmIdList, placementId=%s, ForbidShowList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mnn.remove(str + "_network_firm_a_s");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            this.mnn.remove(str + "_network_firm_f_s");
            return;
        }
        this.mnn.put(str + "_network_firm_f_s", arrayList);
    }

    public final void n(boolean z2) {
        this.moo = z2;
    }

    public final void n(String str, List<String> list) {
        if (m0o()) {
            Log.i(mo.oo0, String.format("setAllowedShowNetworkFimIdList, placementId=%s, allowShowList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mnn.remove(str + "_network_firm_f_s");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            this.mnn.remove(str + "_network_firm_a_s");
            return;
        }
        this.mnn.put(str + "_network_firm_a_s", arrayList);
    }

    private boolean m(Context context, List<String> list, String str) {
        String strO = o(context, list, str);
        boolean zIsEmpty = TextUtils.isEmpty(strO);
        if (zIsEmpty) {
            Log.i(mo.oo0, "Resource: VERIFIED");
            return zIsEmpty;
        }
        Log.e(mo.oo0, androidx.datastore.preferences.protobuf.a.n("Resource: The ", strO, " resources are missing. If shrinkResources is enabled, the ", strO, " resources must be added to the whitelist (keep.xml)"));
        return zIsEmpty;
    }

    public static boolean oo(Context context, List<String> list) {
        int size;
        boolean z2 = true;
        if (list == null || (size = list.size()) == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (int i2 = 0; i2 < size; i2++) {
                    String str = list.get(i2);
                    int length = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (TextUtils.equals(str, strArr[i3])) {
                                break;
                            }
                            i3++;
                        } else {
                            if (sb.length() == 0) {
                                sb.append(str);
                            } else {
                                sb.append(", ");
                                sb.append(str);
                            }
                            z2 = false;
                            break;
                        }
                    }
                }
                z3 = z2;
            } else {
                for (int i4 = 0; i4 < size; i4++) {
                    String str2 = list.get(i4);
                    if (i4 == 0) {
                        sb.append(str2);
                    } else {
                        sb.append(", ");
                        sb.append(str2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z3) {
            Log.i(mo.oo0, "Permission: VERIFIED");
        } else {
            Log.e(mo.oo0, "Permission: Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z3;
    }

    public final void o0(boolean z2) {
        this.noo = z2;
    }

    public final void o(String str, Map<String, Object> map) {
        if (map != null) {
            this.o0n.put(str, map);
        }
    }

    public final long o0(int i2) {
        if (i2 != 1 && i2 != 4 && i2 != 5) {
            return 26214400L;
        }
        com.thinkup.core.oo.o0.o(this.n0);
        return com.thinkup.core.oo.o0.m() * 1024;
    }

    public static void n(Context context) {
        m().oo(context);
    }

    public static /* synthetic */ void o0(o0n o0nVar) {
        com.thinkup.core.common.o0.o.o();
        com.thinkup.core.common.o0.m mVarO = com.thinkup.core.common.o0.o.o(o0nVar.n0);
        if (mVarO != null) {
            o0nVar.o(mVarO.m(), false, mVarO.o(), mVarO.n());
        }
    }

    public final void o(List<String> list) {
        try {
            this.mnm = list;
            if (list != null && !list.isEmpty()) {
                this.mno = new JSONArray((Collection) list);
            } else {
                this.mno = null;
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void n(o0n o0nVar) {
        if (o0nVar.o00m == -1) {
            long jM = onm.m(o0nVar.n0, oo0.m.o, "SPU_UPDATE_6450_TIME_KEY", 0L);
            o0nVar.o00m = jM;
            if (jM == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                o0nVar.o00m = jCurrentTimeMillis;
                onm.o(o0nVar.n0, oo0.m.o, "SPU_UPDATE_6450_TIME_KEY", jCurrentTimeMillis);
            }
        }
    }

    public static /* synthetic */ void o0(Context context) {
        if (m().n("ua")) {
            return;
        }
        try {
            if (oom.o(context).m()) {
                String strMo = com.thinkup.core.common.ooo.n0.mo();
                String strN = onm.n(context, oo0.m.o, "local_os", "");
                if (TextUtils.isEmpty(strMo) || !Build.VERSION.RELEASE.equals(strN)) {
                    com.thinkup.core.common.ooo.n0.nn(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void o(Location location) {
        this.mmn = location;
    }

    public final void m(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.nn.post(runnable);
        }
    }

    public final synchronized void o(boolean z2) {
        try {
            this.mn0 = z2 ? "1" : "2";
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(final Context context, String str, String str2, TUNetworkConfig tUNetworkConfig) {
        try {
            if (this.o0) {
                return;
            }
            this.o0 = true;
            this.n0 = context.getApplicationContext();
            if (context instanceof Activity) {
                o((Activity) context);
            }
            this.o00 = tUNetworkConfig;
            try {
                this.nnm = System.currentTimeMillis();
                this.oo = 0L;
                com.thinkup.core.m.o.o(context.getApplicationContext()).o();
                o(this.n0);
                this.no = str;
                this.nm = str2;
                m();
                o(new AnonymousClass1(str, str2));
                m.n().o((Application) this.n0);
            } catch (Throwable unused) {
            }
            o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.12
                @Override // java.lang.Runnable
                public final void run() {
                    o0n.m(o0n.this);
                    com.thinkup.core.common.o.mo.o(context).o();
                    com.thinkup.core.common.o0m.m mVarO = com.thinkup.core.common.o0m.m.o();
                    Context context2 = context;
                    String[] strArr = {oo0.m.o, oo0.m.f41931n, oo0.m.o0, oo0.m.om, oo0.m.m0, oo0.m.mo, oo0.m.mm, oo0.m.mn, oo0.m.n0, oo0.m.no, oo0.m.nm, oo0.m.nn, oo0.m.o00, "thinkup_app_pl_cl_retry"};
                    for (int i2 = 0; i2 < 14; i2++) {
                        com.thinkup.core.common.o0m.o oVarM = mVarO.m(context2, strArr[i2]);
                        if (oVarM instanceof com.thinkup.core.common.o0m.m.oo) {
                            ((com.thinkup.core.common.o0m.m.oo) oVarM).n();
                        }
                    }
                    o0n.n(o0n.this);
                    o0n.o0(o0n.this);
                }
            });
            oo(context);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void m(Runnable runnable, long j) {
        com.thinkup.core.common.ooo.m.m.o().o(runnable, j);
    }

    public final void m(boolean z2) {
        this.m00 = z2;
    }

    public final void oo(boolean z2) {
        this.nno = z2;
        try {
            synchronized (this.o0om) {
                try {
                    if (!this.o0om.isEmpty()) {
                        for (n0 n0Var : this.o0om) {
                            if (n0Var != null) {
                                n0Var.o(z2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void m(String str, List<String> list) {
        if (m0o()) {
            Log.i(mo.oo0, String.format("setFilterNetworkFirmIdList, placementId=%s, networkFilmIdList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (list == null) {
            this.mnn.remove(str + "_network_firm");
            return;
        }
        this.mnn.put(str + "_network_firm", list);
    }

    public final void m(List<String> list) {
        if (m0o()) {
            Log.i(mo.oo0, String.format("setForbidNetworkFirmIdList, ForbidList=%s", list));
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.size() == 0) {
            this.mnn.remove("forbid_network_firm_list");
        } else {
            this.mnn.put("forbid_network_firm_list", arrayList);
        }
    }

    public static void o(Runnable runnable) {
        com.thinkup.core.common.ooo.m.m.o().m(runnable, 7);
    }

    public final void m(n0 n0Var) {
        if (n0Var != null) {
            try {
                synchronized (this.o0om) {
                    this.o0om.remove(n0Var);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(final String str, boolean z2, int i2, String str2) {
        if (TUCommonConfig.isShowInitErrorTips) {
            Log.e(mo.oo0, str);
            o(new Runnable() { // from class: com.thinkup.core.common.n.o0n.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (o0n.this.n0 != null) {
                        Toast.makeText(o0n.this.n0, str, 1).show();
                    }
                }
            }, 500L);
        }
        if (z2) {
            com.thinkup.core.common.oo0.oo.o(new com.thinkup.core.common.o0.m(i2, str, str2));
        } else {
            this.o00o = new com.thinkup.core.common.o0.m(i2, str, str2);
        }
    }

    public static /* synthetic */ void m(o0n o0nVar) {
        boolean zExists = false;
        if (o0nVar.n0 != null) {
            try {
                zExists = new File(o0nVar.n0.getExternalFilesDir(null), o0nVar.onm).exists();
                if (!zExists) {
                    zExists = new File(o0nVar.n0.getFilesDir(), o0nVar.onm).exists();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        o0nVar.onn = zExists;
    }

    public final void o(Context context, String str, TUDebuggerConfig tUDebuggerConfig) {
        o0m o0mVarN;
        if (context == null) {
            if (m0o()) {
                Log.e("SDK.init", "setDebuggerConfig fail, because context is null.");
                return;
            }
            return;
        }
        if (m().n0 == null) {
            m().o(context.getApplicationContext());
        }
        this.n00 = str;
        this.n0o = tUDebuggerConfig;
        String strO0 = com.thinkup.core.common.ooo.n0.o0(context);
        boolean z2 = true;
        if (TextUtils.isEmpty(strO0) || !strO0.equals(this.n00)) {
            String strOm = com.thinkup.core.common.ooo.n0.om();
            if ((TextUtils.isEmpty(strOm) || !strOm.equals(this.n00)) && ((o0mVarN = m().n()) == null || !o0mVarN.checkDebuggerDevice(context, this.n00))) {
                z2 = false;
            }
        }
        this.n0m = z2;
        if (TextUtils.isEmpty(this.n00)) {
            if (m0o()) {
                Log.e("SDK.init", "Setting Debugger's device fail, because deviceId is empty.");
            }
            this.n0m = false;
        } else {
            if (this.n0m) {
                if (m0o()) {
                    Log.i("SDK.init", "Setting Debugger's device success.");
                }
                if (this.n0o == null || !m0o()) {
                    return;
                }
                Log.i("SDK.init", "Debugger config is in effect now.");
                return;
            }
            if (m0o()) {
                Log.e("SDK.init", "The incoming device id does not match the current device id, and the debugger mode cannot take effect.");
            }
        }
    }

    public static /* synthetic */ void m(o0n o0nVar, Context context) {
        try {
            com.thinkup.core.common.o0.m mVar = o0nVar.o00o;
            if (mVar != null) {
                com.thinkup.core.common.oo0.oo.o(mVar);
                return;
            }
            Object objInvoke = null;
            try {
                objInvoke = AdxTUInitManager.class.getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
            if (objInvoke instanceof TUInitMediation) {
                TUInitMediation tUInitMediation = (TUInitMediation) objInvoke;
                HashMap map = new HashMap();
                map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PRECHECK_MODE, 1);
                com.thinkup.core.o.o.o oVar = new com.thinkup.core.o.o.o();
                oVar.o();
                oVar.o(com.thinkup.core.common.ooo.nn.o());
                oVar.m(o0nVar.o00());
                oVar.n(o0nVar.o0o());
                map.put("sdm_app_data", com.thinkup.core.o.n.o(oVar));
                com.thinkup.core.o.o.oo ooVar = new com.thinkup.core.o.o.oo();
                ooVar.o(o0nVar.ono());
                ooVar.on(com.thinkup.core.common.ooo.n0.o0(context));
                ooVar.n(com.thinkup.core.common.ooo.n0.o0o(context));
                ooVar.oo(com.thinkup.core.common.ooo.n0.m0m());
                ooVar.om(com.thinkup.core.common.ooo.n0.m0n());
                map.put("sdm_device_data", com.thinkup.core.o.n.o(ooVar));
                String[] strArrOm = o0nVar.om();
                if (strArrOm != null && strArrOm.length > 0) {
                    map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO, strArrOm);
                }
                tUInitMediation.initSDK(context, map, o0nVar.new AnonymousClass2(context));
            }
        } catch (Throwable unused2) {
        }
    }

    public final synchronized long o(Context context, String str, int i2) {
        try {
            com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(context).m(str);
            String strN = onm.n(context, oo0.m.o, "SPU_PSID_KEY", "");
            String strN2 = onm.n(context, oo0.m.o, "SPU_SESSIONID_KEY", "");
            long jM = onm.m(context, oo0.m.o, "SPU_INIT_TIME_KEY", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jM < 0) {
                jM = 0;
            }
            if (jCurrentTimeMillis - jM <= (i2 == 0 ? mVarM.n00() : mVarM.m0o())) {
                mVarM.n00();
                this.oom = strN;
                if (!TextUtils.isEmpty(strN2)) {
                    synchronized (this.om0) {
                        this.oon = new JSONObject(strN2);
                    }
                }
                return 0L;
            }
            mVarM.n00();
            String strOno = ono();
            String strValueOf = "";
            if (TextUtils.isEmpty(strOno)) {
                strOno = com.thinkup.core.common.ooo.n0.o0(context) + com.thinkup.core.common.ooo.n0.om();
                strValueOf = String.valueOf(new Random().nextInt(10000000));
            }
            this.oom = com.thinkup.core.common.ooo.nm.o(strOno + str + strValueOf + jCurrentTimeMillis);
            synchronized (this.om0) {
                this.oon = new JSONObject();
            }
            onm.m(context, oo0.m.o, "SPU_PSID_KEY", this.oom);
            onm.m(context, oo0.m.o, "SPU_SESSIONID_KEY", "");
            onm.o(context, oo0.m.o, "SPU_INIT_TIME_KEY", jCurrentTimeMillis);
            com.thinkup.core.common.oo0.oo.o((String) null, "1", strValueOf, String.valueOf(jCurrentTimeMillis));
            if (i2 == 0) {
                this.oo = jCurrentTimeMillis;
            }
            return jCurrentTimeMillis;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public static boolean o(Context context, List<String> list) {
        boolean z2 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            try {
                if (context.getPackageManager().queryIntentActivities(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                    sb.append(", ");
                    sb.append(str);
                    z2 = false;
                }
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (z2) {
            Log.i(mo.oo0, "Activities : VERIFIED");
        } else {
            Log.e(mo.oo0, "Activities : Missing " + sb.toString() + " declare in AndroidManifest");
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2 A[RETURN] */
    public final String o(Context context, List<String> list, String str) {
        String str2;
        if (list == null || list.size() == 0) {
            return "";
        }
        boolean z2 = false;
        try {
            int size = list.size();
            str2 = "";
            boolean z3 = true;
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    String str3 = list.get(i2);
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = str3.split("_")[0] + "_*";
                        }
                        int identifier = !TextUtils.isEmpty(str) ? context.getResources().getIdentifier(str3, "layout", str) : -1;
                        if (identifier <= 0 && !TextUtils.isEmpty(this.nn0)) {
                            identifier = context.getResources().getIdentifier(str3, "layout", this.nn0);
                        }
                        if (identifier <= 0) {
                            identifier = context.getResources().getIdentifier(str3, "layout", context.getPackageName());
                        }
                        if (identifier <= 0) {
                            if (z2) {
                                return "";
                            }
                            return str2;
                        }
                        XmlResourceParser layout = null;
                        try {
                            layout = context.getResources().getLayout(identifier);
                            while (true) {
                                int next = layout.next();
                                if (next == 1) {
                                    break;
                                }
                                if (next == 2) {
                                    if ("x".equalsIgnoreCase(layout.getName())) {
                                        if (layout.getAttributeCount() == 0) {
                                            z3 = false;
                                            break;
                                        }
                                    } else if (layout.getAttributeCount() >= 0) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                th.printStackTrace();
                                if (layout != null) {
                                    break;
                                }
                            } catch (Throwable th2) {
                                if (layout != null) {
                                    layout.close();
                                }
                                throw th2;
                            }
                        }
                        layout.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th.printStackTrace();
                }
            }
            z2 = z3;
        } catch (Throwable th4) {
            th = th4;
            str2 = "";
        }
        if (z2) {
            return "";
        }
        return str2;
    }

    public final void o(final Context context, boolean z2) {
        Runnable runnable = new Runnable() { // from class: com.thinkup.core.common.n.o0n.7
            @Override // java.lang.Runnable
            public final void run() {
                if (com.thinkup.core.oo.o0.o(context).o(o0n.this.no)) {
                    com.thinkup.core.oo.o0.o(context).o(o0n.this.no, o0n.this.nm);
                }
                com.thinkup.core.oo.o0.o(context).m(o0n.this.no);
            }
        };
        if (z2) {
            com.thinkup.core.common.ooo.m.m.o().m(runnable, 2);
        } else {
            com.thinkup.core.common.ooo.m.m.o().n(runnable, 13);
        }
    }

    public final void o(Runnable runnable, long j) {
        if (j <= 0 && Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.nn.postDelayed(runnable, j);
        }
    }

    private static long o(long j) {
        Date date = new Date(j);
        return new Date(date.getYear(), date.getMonth(), date.getDate()).getTime();
    }

    public final void o(String str, List<String> list) {
        if (m0o()) {
            Log.i(mo.oo0, String.format("setFilterAdSourceIdList, placementId=%s, adSourceIdList=%s", str, list));
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (list == null) {
            this.mnn.remove(str);
        } else {
            this.mnn.put(str, list);
        }
    }

    public final void o(int i2, List<String> list) {
        if (m0o()) {
            Log.i(mo.oo0, String.format("setForbidShowNetworkFirmIdList, risk=%s, ForbidList=%s", Integer.valueOf(i2), list));
        }
        this.o0o0 = new Pair<>(Integer.valueOf(i2), list);
        m0n();
    }

    public final void o(ITUDeviceRiskListener iTUDeviceRiskListener) {
        this.om = iTUDeviceRiskListener;
    }

    public final void o(com.thinkup.core.oo.m mVar) {
        if (mVar != null) {
            try {
                if (m0o()) {
                    Log.e(mo.oo0, "notifyDeviceRisk:" + this.om);
                }
                if (this.om != null) {
                    JSONObject jSONObject = new JSONObject();
                    String strOno = ono();
                    if (!TextUtils.isEmpty(strOno)) {
                        jSONObject.put("device_upid", strOno);
                    }
                    String strOm = mVar.om();
                    if (!TextUtils.isEmpty(strOm)) {
                        jSONObject.put("device_risk_labels", strOm);
                    }
                    this.om.onDeviceRiskInfo(jSONObject);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean o(List<String> list, String str) {
        return list != null && list.contains(str);
    }

    public final void o(final Context context, final DeviceInfoCallback deviceInfoCallback) {
        if (!m0o()) {
            String strConcat = "Before call \"TUSDK.testModeDeviceInfo()\", you must to call \"TUSDK.setNetworkLogDebug(true);\" first. ".concat("Note: The call to the \"TUSDK.testModeDeviceInfo()\" method must be removed after the test is completed!!!");
            Log.e(mo.oo0, strConcat);
            if (deviceInfoCallback != null) {
                deviceInfoCallback.deviceInfo(strConcat);
                return;
            }
            return;
        }
        Log.e(mo.oo0, "Note: The call to the \"TUSDK.testModeDeviceInfo()\" method must be removed after the test is completed!!!");
        if (!this.o0) {
            Log.e(mo.oo0, "You should init SDK first.");
            if (deviceInfoCallback != null) {
                deviceInfoCallback.deviceInfo("You should init SDK first.");
                return;
            }
            return;
        }
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.n.o0n.8
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.oo.m mVarH = com.google.firebase.crashlytics.internal.model.a.h(com.thinkup.core.oo.o0.o(context));
                String strMoo = mVarH != null ? mVarH.moo() : "";
                boolean z2 = true;
                if (!TextUtils.isEmpty(strMoo)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strMoo);
                        if (!jSONObject.isNull("a") && jSONObject.optInt("a") != 1) {
                            z2 = false;
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    o0m o0mVarN = o0n.m().n();
                    if (o0mVarN != null) {
                        o0mVarN.fillTestDeviceData(jSONObject2, mVarH);
                    }
                    jSONObject2.put(IronSourceConstants.TYPE_GAID, com.thinkup.core.common.ooo.n0.o0o(context));
                    jSONObject2.put("AndroidID", z2 ? com.thinkup.core.common.ooo.n0.o0(context) : "");
                    jSONObject2.put("How to config TestMode", "Please visit the document center and learn more through: Integration(Basic) -> How To Test");
                    omn.o("testModeDeviceInfo", jSONObject2.toString());
                    DeviceInfoCallback deviceInfoCallback2 = deviceInfoCallback;
                    if (deviceInfoCallback2 != null) {
                        deviceInfoCallback2.deviceInfo(jSONObject2.toString());
                    }
                } catch (Throwable unused2) {
                }
            }
        }, 2);
    }

    public final void o(final String str, final String str2, final String str3, final Map<String, Object> map) {
        if (!this.o0) {
            Log.e("SDK.init", "SDK should be inited first!");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("SDK.init", "Please put placementId!");
            return;
        }
        final com.thinkup.core.common.om omVarO = com.thinkup.core.common.ooo.o().o(str, str3);
        if (omVarO == null) {
            Log.e("SDK.init", "The \"" + str + "\" object has not been created yet!");
            return;
        }
        final boolean zOn = omVarO.on();
        ono onoVar = new ono();
        onoVar.o(map);
        onoVar.o(omVarO.mo());
        final com.thinkup.core.common.on.o oVarM = omVarO.m(this.n0, false, false, onoVar);
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.n.o0n.9
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(o0n.this.n0).o(str);
                String strM0 = omVarO.m0();
                String strO0 = com.thinkup.core.common.ooo.nn.o0(str2);
                com.thinkup.core.common.on.o oVar = oVarM;
                if (oVar != null) {
                    com.thinkup.core.common.on.n0 n0VarNmm = oVar.mo().nmm();
                    n0VarNmm.mn(1);
                    n0VarNmm.m0o = strO0;
                    if (oon.o().o(n0VarO)) {
                        m0m.o(str, n0VarO, n0VarNmm);
                    }
                    com.thinkup.core.common.oo0.n.o(o0n.this.n0).o(16, n0VarNmm);
                    return;
                }
                if (TextUtils.isEmpty(strM0)) {
                    strM0 = "";
                }
                com.thinkup.core.common.on.n0 n0VarO2 = m0m.o(strM0, str, n0VarO, 0, 0, map, null, 0, omVarO.mo());
                n0VarO2.mn(zOn ? 3 : 2);
                if (n0VarO == null) {
                    n0VarO2.mom(str3);
                }
                n0VarO2.m0o = strO0;
                if (oon.o().o(n0VarO)) {
                    m0m.o(str, n0VarO, n0VarO2);
                }
                com.thinkup.core.common.oo0.n.o(o0n.this.n0).o(16, n0VarO2);
            }
        }, 2);
    }

    public final void o(Activity activity) {
        WeakReference<Activity> weakReference = this.on;
        if (weakReference == null || weakReference.get() == null) {
            this.on = new WeakReference<>(activity);
        }
    }

    private void o(Context context, TUNetworkConfig tUNetworkConfig) {
        if (tUNetworkConfig == null) {
            tUNetworkConfig = new TUNetworkConfig();
        }
        List<TUInitConfig> tUInitConfigList = tUNetworkConfig.getTUInitConfigList();
        if (tUInitConfigList == null) {
            tUInitConfigList = new ArrayList<>(2);
        }
        try {
            if (omn()) {
                tUInitConfigList.clear();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            tUInitConfigList = new ArrayList<>(2);
        }
        TUInitConfig tUInitConfig = null;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT != 29 && !o(m().moo(), "1")) {
            try {
                Constructor declaredConstructor = FacebookTUInitConfig.class.asSubclass(TUInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                TUInitConfig tUInitConfig2 = (TUInitConfig) declaredConstructor.newInstance(new Object[0]);
                try {
                    tUInitConfigList.add(0, tUInitConfig2);
                } catch (Throwable unused) {
                }
                tUInitConfig = tUInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        this.mon = tUInitConfigList.size() > 0;
        for (TUInitConfig tUInitConfig3 : tUInitConfigList) {
            if (tUInitConfig3 != null) {
                if (tUInitConfig != null && TextUtils.equals(tUInitConfig.getClass().getSimpleName(), tUInitConfig3.getClass().getSimpleName())) {
                    if (!z2) {
                        z2 = true;
                    }
                }
                o(new AnonymousClass10(tUInitConfig3, context));
            }
        }
    }

    public final void o(String str, Map<String, Object> map, String... strArr) {
        com.thinkup.core.common.on.n0 n0Var;
        if (map == null || map.containsKey(TUInitMediation.KEY_LOCAL)) {
            return;
        }
        try {
            n0Var = (com.thinkup.core.common.on.n0) map.get(mo.oon.mo);
        } catch (Throwable unused) {
            n0Var = null;
        }
        map.remove(mo.oon.mo);
        String string = new JSONObject(map).toString();
        Log.e(mo.oo0, "Mismatched initialization parameters! server params: [" + str + "], " + string);
        onm.m(this.n0, oo0.m.m0, str, string);
        if (n0Var == null || strArr == null) {
            return;
        }
        try {
            com.thinkup.core.common.oo0.oo.o(n0Var, strArr[0], strArr.length > 1 ? strArr[1] : null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void o(String[] strArr, ITUAdFilter iTUAdFilter) {
        ConcurrentHashMap<String, ITUAdFilter> concurrentHashMap = this.nom;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.nom == null) {
            this.nom = new ConcurrentHashMap<>();
        }
        for (String str : strArr) {
            this.nom.put(str, iTUAdFilter);
        }
    }

    public final void o(TUUserDeviceInfo tUUserDeviceInfo) {
        this.nm0 = tUUserDeviceInfo;
    }

    public static void o(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            com.thinkup.core.oo.nm.o(context.getApplicationContext()).mo(str);
            com.thinkup.core.oo.o0.o(context.getApplicationContext()).n(str);
        } else {
            Log.e("SDK.init", "setPrePlacementStrategy failed: path is null or empty.");
        }
    }

    public static void o(TUSharedPlacementConfig tUSharedPlacementConfig) {
        oon.o().o(tUSharedPlacementConfig);
    }

    public final void o(n0 n0Var) {
        if (n0Var != null) {
            try {
                synchronized (this.o0om) {
                    try {
                        if (!this.o0om.contains(n0Var)) {
                            this.o0om.add(n0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void o(String str, TUAdFilter tUAdFilter) {
        if (TextUtils.isEmpty(str) || tUAdFilter == null) {
            return;
        }
        this.o0on.put(str, tUAdFilter);
    }

    public static void o(String str, String str2) {
        com.thinkup.core.common.oo0.oo.o("1", str, str2);
    }

    public final void o(Boolean bool) {
        if (bool != null) {
            synchronized (this.ooo) {
                try {
                    if (!bool.booleanValue()) {
                        this.ooo.put("sensor_deny", Boolean.TRUE);
                    } else {
                        this.ooo.remove("sensor_deny");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void o(o0n o0nVar, Context context) {
        long jCurrentTimeMillis = o0nVar.oo;
        try {
            String strN = onm.n(m().n0, oo0.m.o, m().o00() + "playRecord", "");
            if (!TextUtils.isEmpty(strN)) {
                JSONObject jSONObject = new JSONObject(strN);
                long jOptLong = jSONObject.optLong("start_time");
                long jOptLong2 = jSONObject.optLong("end_time");
                String strOptString = jSONObject.optString("psid");
                int iOptInt = jSONObject.optInt("launch_mode");
                if (jCurrentTimeMillis != 0) {
                    com.thinkup.core.common.oo0.oo.o(iOptInt == 1 ? 4 : 2, jOptLong, jOptLong2, strOptString);
                } else {
                    jCurrentTimeMillis = jOptLong;
                }
                onm.m(m().n0, oo0.m.o, m().o00() + "playRecord", "");
            }
        } catch (Exception unused) {
            onm.m(m().n0, oo0.m.o, m().o00() + "playRecord", "");
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = onm.m(context, oo0.m.o, "SPU_INIT_TIME_KEY", 0L);
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        m.n().o(new om(jCurrentTimeMillis));
    }

    public static /* synthetic */ void o(o0n o0nVar, Context context, TUNetworkConfig tUNetworkConfig) {
        if (tUNetworkConfig == null) {
            tUNetworkConfig = new TUNetworkConfig();
        }
        List<TUInitConfig> tUInitConfigList = tUNetworkConfig.getTUInitConfigList();
        if (tUInitConfigList == null) {
            tUInitConfigList = new ArrayList<>(2);
        }
        try {
            if (o0nVar.omn()) {
                tUInitConfigList.clear();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            tUInitConfigList = new ArrayList<>(2);
        }
        TUInitConfig tUInitConfig = null;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT != 29 && !o(m().moo(), "1")) {
            try {
                Constructor declaredConstructor = FacebookTUInitConfig.class.asSubclass(TUInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                TUInitConfig tUInitConfig2 = (TUInitConfig) declaredConstructor.newInstance(new Object[0]);
                try {
                    tUInitConfigList.add(0, tUInitConfig2);
                } catch (Throwable unused) {
                }
                tUInitConfig = tUInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        o0nVar.mon = tUInitConfigList.size() > 0;
        for (TUInitConfig tUInitConfig3 : tUInitConfigList) {
            if (tUInitConfig3 != null) {
                if (tUInitConfig != null && TextUtils.equals(tUInitConfig.getClass().getSimpleName(), tUInitConfig3.getClass().getSimpleName())) {
                    if (!z2) {
                        z2 = true;
                    }
                }
                o(o0nVar.new AnonymousClass10(tUInitConfig3, context));
            }
        }
    }
}
