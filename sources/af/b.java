package af;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kb.f;
import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3555b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final va.a f3557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final va.b f3558e;

    public b(String str, SharedPreferences sharedPreferences, va.a aVar, va.b bVar) {
        this.f3556c = str;
        this.f3554a = sharedPreferences;
        this.f3557d = aVar;
        this.f3558e = bVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return f.b(this.f3558e.a(str.getBytes(StandardCharsets.UTF_8), this.f3556c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    public final Object b(String str) {
        int i10;
        String str2;
        if (c(str)) {
            throw new SecurityException(wi.d.h(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = a(str);
            String string = this.f3554a.getString(strA, null);
            if (string != null) {
                byte[] bArrA = f.a(string);
                va.a aVar = this.f3557d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strA.getBytes(charset)));
                byteBufferWrap.position(0);
                int i11 = byteBufferWrap.getInt();
                if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 1) {
                    i10 = 2;
                } else if (i11 == 2) {
                    i10 = 3;
                } else if (i11 == 3) {
                    i10 = 4;
                } else if (i11 != 4) {
                    i10 = i11 != 5 ? 0 : 6;
                } else {
                    i10 = 5;
                }
                if (i10 == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i11);
                }
                int iC = i.c(i10);
                if (iC == 0) {
                    int i12 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i12);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iC != 1) {
                        if (iC == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iC == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iC == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iC == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i10) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    x.f fVar = new x.f(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i13 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i13);
                        byteBufferWrap.position(byteBufferWrap.position() + i13);
                        fVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (fVar.f53497c != 1 || !"__NULL__".equals(fVar.f53496b[0])) {
                        return fVar;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (c(str)) {
            throw new SecurityException(wi.d.h(str, " is a reserved key for the encryption keyset."));
        }
        return this.f3554a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f3554a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f3554a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f3558e.b(f.a(entry.getKey()), this.f3556c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (GeneralSecurityException e10) {
                    throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        Object objB = b(str);
        return objB instanceof Float ? ((Float) objB).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objB = b(str);
        Set fVar = objB instanceof Set ? (Set) objB : new x.f(0);
        return !fVar.isEmpty() ? fVar : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3555b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3555b.remove(onSharedPreferenceChangeListener);
    }
}
