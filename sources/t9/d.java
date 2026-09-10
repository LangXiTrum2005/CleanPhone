package t9;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.impl.ca;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.ads.t0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import d5.o;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ne.c f50563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ne.a f50564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ne.c f50565d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f50567f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f50568g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f50569h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f50570i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f50571j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ne.a f50573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static g f50574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static h f50575o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50576a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ThreadLocal f50572k = new ThreadLocal();
    public static final co.c l = new co.c(18);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ne.a f50566e = new ne.a(20);

    static {
        int i10 = 18;
        f50573m = new ne.a(i10);
        f50563b = new ne.c(i10);
        int i11 = 19;
        f50564c = new ne.a(i11);
        f50565d = new ne.c(i11);
    }

    public d(Context context) {
        this.f50576a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (c0.l(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(str.length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c A[Catch: all -> 0x0225, a -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, a -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x024d A[Catch: all -> 0x0225, a -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, a -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0263 A[Catch: all -> 0x0225, a -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, a -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x026c A[Catch: all -> 0x0225, a -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, a -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0274 A[Catch: all -> 0x0225, a -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, a -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x027e A[Catch: all -> 0x0225, a -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, a -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x028c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:136:0x0305  */
    /* JADX WARN: Code duplicated, block: B:139:0x030e  */
    /* JADX WARN: Code duplicated, block: B:144:0x031f A[Catch: all -> 0x00b8, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a3, B:128:0x02b2, B:130:0x02da, B:132:0x02eb, B:142:0x0317, B:143:0x031e, B:123:0x02a6, B:124:0x02a7, B:125:0x02ae, B:144:0x031f, B:145:0x033f, B:146:0x0340, B:147:0x038d), top: B:168:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a3, B:128:0x02b2, B:130:0x02da, B:132:0x02eb, B:142:0x0317, B:143:0x031e, B:123:0x02a6, B:124:0x02a7, B:125:0x02ae, B:144:0x031f, B:145:0x033f, B:146:0x0340, B:147:0x038d), top: B:168:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x0288, TryCatch #4 {all -> 0x0288, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:163:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9 A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4 A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7 A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x020a A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0212 A[Catch: all -> 0x0173, a -> 0x0178, RemoteException -> 0x017d, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x017d, a -> 0x0178, all -> 0x0173, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0132, B:46:0x0138, B:48:0x0140, B:50:0x0144, B:51:0x0152, B:58:0x015d, B:66:0x0197, B:68:0x019f, B:69:0x01a6, B:70:0x01ad, B:65:0x0182, B:73:0x01b0, B:74:0x01b1, B:75:0x01b8, B:76:0x01b9, B:77:0x01c0, B:80:0x01c3, B:81:0x01c4, B:83:0x01f7, B:85:0x020a, B:87:0x0212), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022e A[Catch: all -> 0x0225, a -> 0x0228, RemoteException -> 0x022b, TryCatch #11 {RemoteException -> 0x022b, a -> 0x0228, all -> 0x0225, blocks: (B:89:0x0216, B:102:0x025d, B:104:0x0263, B:105:0x026c, B:106:0x0273, B:96:0x022e, B:97:0x0237, B:100:0x023c, B:101:0x024d, B:107:0x0274, B:108:0x027d, B:109:0x027e, B:110:0x0287, B:118:0x0298), top: B:167:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [t9.c] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.content.Context] */
    public static d c(Context context, c cVar, String str) throws a {
        ?? r10;
        int i10;
        d dVar;
        Cursor cursor;
        int i11;
        ?? r11;
        Boolean bool;
        g gVarH;
        int i12;
        s9.a aVarC1;
        Object objY1;
        f fVar;
        h hVar;
        f fVar2;
        boolean z10;
        s9.a aVarC2;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = f50572k;
        f fVar3 = (f) threadLocal.get();
        f fVar4 = new f();
        threadLocal.set(fVar4);
        co.c cVar2 = l;
        Long l10 = (Long) cVar2.get();
        long jLongValue = l10.longValue();
        try {
            cVar2.set(Long.valueOf(SystemClock.uptimeMillis()));
            t0 t0VarK = cVar.k(context, str, f50573m);
            int i13 = t0VarK.f20103a;
            int i14 = t0VarK.f20104b;
            StringBuilder sb2 = new StringBuilder(str.length() + 26 + String.valueOf(i13).length() + 19 + str.length() + 1 + String.valueOf(i14).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i13);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i14);
            Log.i("DynamiteModule", sb2.toString());
            int i15 = t0VarK.f20105c;
            if (i15 != 0) {
                if (i15 != -1) {
                    if (i15 == 1 || t0VarK.f20104b != 0) {
                        if (i15 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            d dVar2 = new d(applicationContext);
                            if (jLongValue == 0) {
                                cVar2.remove();
                            } else {
                                cVar2.set(l10);
                            }
                            cursor2 = fVar4.f50580a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(fVar3);
                            return dVar2;
                        }
                        if (i15 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i15);
                            throw new a(sb3.toString());
                        }
                        try {
                            try {
                                i11 = t0VarK.f20104b;
                                try {
                                    try {
                                        try {
                                            synchronized (d.class) {
                                                try {
                                                    if (e(context)) {
                                                        throw new a("Remote loading disabled");
                                                    }
                                                    bool = f50567f;
                                                    if (bool != null) {
                                                        throw new a("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i11);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        synchronized (d.class) {
                                                            hVar = f50575o;
                                                        }
                                                        if (hVar != null) {
                                                            throw new a("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        fVar2 = (f) threadLocal.get();
                                                        if (fVar2 != null || fVar2.f50580a == null) {
                                                            throw new a("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = fVar2.f50580a;
                                                        new s9.b(null);
                                                        synchronized (d.class) {
                                                            z10 = f50570i >= 2;
                                                        }
                                                        if (z10) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            aVarC2 = hVar.D1(new s9.b(applicationContext2), str, i11, new s9.b(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            aVarC2 = hVar.C1(new s9.b(applicationContext2), str, i11, new s9.b(cursor3));
                                                        }
                                                        Context context2 = (Context) s9.b.y1(aVarC2);
                                                        if (context2 == null) {
                                                            throw new a("Failed to get module context");
                                                        }
                                                        dVar = new d(context2);
                                                    } else {
                                                        StringBuilder sb5 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                                                        sb5.append("Selected remote version of ");
                                                        sb5.append(str);
                                                        sb5.append(", version >= ");
                                                        sb5.append(i11);
                                                        Log.i("DynamiteModule", sb5.toString());
                                                        gVarH = h(context);
                                                        if (gVarH != null) {
                                                            throw new a("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelR = gVarH.r(gVarH.u1(), 6);
                                                        i12 = parcelR.readInt();
                                                        parcelR.recycle();
                                                        if (i12 >= 3) {
                                                            fVar = (f) threadLocal.get();
                                                            if (fVar != null) {
                                                                throw new a("No cached result cursor holder");
                                                            }
                                                            aVarC1 = gVarH.E1(new s9.b(context), str, i11, new s9.b(fVar.f50580a));
                                                        } else if (i12 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            aVarC1 = gVarH.D1(new s9.b(context), str, i11);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            aVarC1 = gVarH.C1(new s9.b(context), str, i11);
                                                        }
                                                        objY1 = s9.b.y1(aVarC1);
                                                        if (objY1 != null) {
                                                            throw new a("Failed to load remote module.");
                                                        }
                                                        dVar = new d((Context) objY1);
                                                    }
                                                    if (jLongValue == 0) {
                                                        l.remove();
                                                    } else {
                                                        l.set(l10);
                                                    }
                                                    cursor = fVar4.f50580a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f50572k.set(fVar3);
                                                    return dVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    throw th;
                                                }
                                            }
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            throw new a("Failed to load remote module.", e);
                                        } catch (a e11) {
                                            throw e11;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r11 = context;
                                            p9.c.a(r11, th);
                                            throw new a("Failed to load remote module.", th);
                                        }
                                    } catch (RemoteException e12) {
                                        e = e12;
                                        throw new a("Failed to load remote module.", e);
                                    } catch (a e13) {
                                        throw e13;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r11 = cVar2;
                                        p9.c.a(r11, th);
                                        throw new a("Failed to load remote module.", th);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (a e14) {
                                e = e14;
                                r10 = cVar2;
                                String message = e.getMessage();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb6.append("Failed to load remote module: ");
                                sb6.append(message);
                                Log.w("DynamiteModule", sb6.toString());
                                i10 = t0VarK.f20103a;
                                if (i10 != 0) {
                                }
                                throw new a("Remote load failed. No local fallback found.", e);
                            }
                        } catch (a e15) {
                            e = e15;
                            r10 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb7 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb7.append("Failed to load remote module: ");
                            sb7.append(message2);
                            Log.w("DynamiteModule", sb7.toString());
                            i10 = t0VarK.f20103a;
                            if (i10 != 0 || cVar.k(r10, str, new o(i10, 18)).f20105c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            dVar = new d(applicationContext);
                        }
                    }
                } else if (t0VarK.f20103a != 0) {
                    i15 = -1;
                    if (i15 == 1) {
                    }
                    if (i15 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        d dVar3 = new d(applicationContext);
                        if (jLongValue == 0) {
                            cVar2.remove();
                        } else {
                            cVar2.set(l10);
                        }
                        cursor2 = fVar4.f50580a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(fVar3);
                        return dVar3;
                    }
                    if (i15 == 1) {
                        StringBuilder sb8 = new StringBuilder(String.valueOf(i15).length() + 36);
                        sb8.append("VersionPolicy returned invalid code:");
                        sb8.append(i15);
                        throw new a(sb8.toString());
                    }
                    i11 = t0VarK.f20104b;
                    synchronized (d.class) {
                        if (e(context)) {
                            throw new a("Remote loading disabled");
                        }
                        bool = f50567f;
                        if (bool != null) {
                            throw new a("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                            sb9.append("Selected remote version of ");
                            sb9.append(str);
                            sb9.append(", version >= ");
                            sb9.append(i11);
                            Log.i("DynamiteModule", sb9.toString());
                            synchronized (d.class) {
                                hVar = f50575o;
                                if (hVar != null) {
                                    throw new a("DynamiteLoaderV2 was not cached.");
                                }
                                fVar2 = (f) threadLocal.get();
                                if (fVar2 != null) {
                                }
                                throw new a("No result cursor");
                            }
                        }
                        StringBuilder sb10 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                        sb10.append("Selected remote version of ");
                        sb10.append(str);
                        sb10.append(", version >= ");
                        sb10.append(i11);
                        Log.i("DynamiteModule", sb10.toString());
                        gVarH = h(context);
                        if (gVarH != null) {
                            throw new a("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelR2 = gVarH.r(gVarH.u1(), 6);
                        i12 = parcelR2.readInt();
                        parcelR2.recycle();
                        if (i12 >= 3) {
                            fVar = (f) threadLocal.get();
                            if (fVar != null) {
                                throw new a("No cached result cursor holder");
                            }
                            aVarC1 = gVarH.E1(new s9.b(context), str, i11, new s9.b(fVar.f50580a));
                        } else if (i12 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarC1 = gVarH.D1(new s9.b(context), str, i11);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarC1 = gVarH.C1(new s9.b(context), str, i11);
                        }
                        objY1 = s9.b.y1(aVarC1);
                        if (objY1 != null) {
                            throw new a("Failed to load remote module.");
                        }
                        dVar = new d((Context) objY1);
                        if (jLongValue == 0) {
                            l.remove();
                        } else {
                            l.set(l10);
                        }
                        cursor = fVar4.f50580a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f50572k.set(fVar3);
                        return dVar;
                    }
                }
            }
            int i16 = t0VarK.f20103a;
            int i17 = t0VarK.f20104b;
            StringBuilder sb11 = new StringBuilder(str.length() + 46 + String.valueOf(i16).length() + 23 + String.valueOf(i17).length() + 1);
            sb11.append("No acceptable module ");
            sb11.append(str);
            sb11.append(" found. Local version is ");
            sb11.append(i16);
            sb11.append(" and remote version is ");
            sb11.append(i17);
            sb11.append(".");
            throw new a(sb11.toString());
        } catch (Throwable th6) {
            if (jLongValue == 0) {
                l.remove();
            } else {
                l.set(l10);
            }
            Cursor cursor4 = fVar4.f50580a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f50572k.set(fVar3);
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[Catch: all -> 0x003a, TryCatch #6 {all -> 0x003a, blocks: (B:10:0x002b, B:12:0x0037, B:49:0x00a2, B:17:0x003e, B:19:0x0044, B:21:0x004a, B:26:0x0050, B:28:0x0054, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:40:0x0081, B:41:0x0089, B:39:0x0073, B:44:0x008c, B:47:0x008f, B:48:0x0099, B:18:0x0041), top: B:137:0x002b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    public static int d(Context context, String str, boolean z10) {
        Throwable th2;
        RemoteException e10;
        int i10;
        Cursor cursor;
        try {
            synchronized (d.class) {
                Boolean bool = f50567f;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (f50569h) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z10, true);
                                                String str2 = f50568g;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderE = e.E();
                                                    if (classLoaderE == null) {
                                                        String str3 = f50568g;
                                                        c0.h(str3);
                                                        classLoaderE = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    }
                                                    g(classLoaderE);
                                                    declaredField.set(null, classLoaderE);
                                                    f50567f = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f50567f = bool;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String string = e11.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(string);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z10, false);
                    } catch (a e12) {
                        String message = e12.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                g gVarH = h(context);
                try {
                    if (gVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelR = gVarH.r(gVarH.u1(), 6);
                        int i11 = parcelR.readInt();
                        parcelR.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f50572k;
                            f fVar = (f) threadLocal.get();
                            if (fVar != null && (cursor = fVar.f50580a) != null) {
                                return cursor.getInt(0);
                            }
                            s9.b bVar = new s9.b(context);
                            long jLongValue = ((Long) l.get()).longValue();
                            Parcel parcelU1 = gVarH.u1();
                            z9.g.b(parcelU1, bVar);
                            parcelU1.writeString(str);
                            parcelU1.writeInt(z10 ? 1 : 0);
                            parcelU1.writeLong(jLongValue);
                            Cursor cursor3 = (Cursor) s9.b.y1(ca.o(gVarH.r(parcelU1, 7)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            f fVar2 = (f) threadLocal.get();
                                            if (fVar2 == null || fVar2.f50580a != null) {
                                                z11 = false;
                                            } else {
                                                fVar2.f50580a = cursor3;
                                            }
                                            cursor2 = z11 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e13) {
                                    e10 = e13;
                                    cursor2 = cursor3;
                                    String message2 = e10.getMessage();
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb4.append("Failed to retrieve remote module version: ");
                                    sb4.append(message2);
                                    Log.w("DynamiteModule", sb4.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            s9.b bVar2 = new s9.b(context);
                            Parcel parcelU2 = gVarH.u1();
                            z9.g.b(parcelU2, bVar2);
                            parcelU2.writeString(str);
                            parcelU2.writeInt(z10 ? 1 : 0);
                            Parcel parcelR2 = gVarH.r(parcelU2, 5);
                            i10 = parcelR2.readInt();
                            parcelR2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            s9.b bVar3 = new s9.b(context);
                            Parcel parcelU3 = gVarH.u1();
                            z9.g.b(parcelU3, bVar3);
                            parcelU3.writeString(str);
                            parcelU3.writeInt(z10 ? 1 : 0);
                            Parcel parcelR3 = gVarH.r(parcelU3, 3);
                            i10 = parcelR3.readInt();
                            parcelR3.recycle();
                        }
                        return i10;
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        } catch (Throwable th6) {
            p9.c.a(context, th6);
            throw th6;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f50571j)) {
            return true;
        }
        boolean z10 = false;
        if (f50571j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (i9.e.f42929b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f50571j = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f50569h = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Exception exc;
        Throwable th2;
        MatrixCursor matrixCursor;
        boolean z12;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z13 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) l.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z14 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr[i11] = null;
                                        } else if (type == 1) {
                                            objArr[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th3) {
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (d.class) {
                                    try {
                                        f50568g = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f50570i = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z12 = matrixCursor.getInt(columnIndex2) != 0;
                                            f50569h = z12;
                                        } else {
                                            z12 = false;
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                f fVar = (f) f50572k.get();
                                if (fVar == null || fVar.f50580a != null) {
                                    z13 = false;
                                } else {
                                    fVar.f50580a = matrixCursor;
                                }
                                z14 = z12;
                                matrixCursor2 = z13 ? null : matrixCursor;
                            }
                            if (z11 && z14) {
                                throw new a("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new a(sb2.toString(), exc);
                    } catch (Throwable th7) {
                        th2 = th7;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th2;
                        }
                        matrixCursor2.close();
                        throw th2;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Throwable th8) {
            th2 = th8;
        }
    }

    public static void g(ClassLoader classLoader) throws a {
        try {
            h hVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 5);
            }
            f50575o = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10);
        }
    }

    public static g h(Context context) {
        g gVar;
        synchronized (d.class) {
            g gVar2 = f50574n;
            if (gVar2 != null) {
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    gVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 5);
                }
                if (gVar != null) {
                    f50574n = gVar;
                    return gVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws a {
        try {
            return (IBinder) this.f50576a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10);
        }
    }
}
