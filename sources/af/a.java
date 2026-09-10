package af;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f3551b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3553d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f3552c = new CopyOnWriteArrayList();

    public a(b bVar, SharedPreferences.Editor editor) {
        this.f3550a = bVar;
        this.f3551b = editor;
    }

    public final void a() {
        if (this.f3553d.getAndSet(false)) {
            b bVar = this.f3550a;
            for (String str : ((HashMap) bVar.getAll()).keySet()) {
                if (!this.f3552c.contains(str) && !b.c(str)) {
                    this.f3551b.remove(bVar.a(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f3551b.apply();
        b();
        this.f3552c.clear();
    }

    public final void b() {
        b bVar = this.f3550a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f3555b) {
            Iterator it = this.f3552c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        b bVar = this.f3550a;
        bVar.getClass();
        if (b.c(str)) {
            throw new SecurityException(wi.d.h(str, " is a reserved key for the encryption keyset."));
        }
        this.f3552c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = bVar.a(str);
            Pair pair = new Pair(strA, f.b(bVar.f3557d.a(bArr, strA.getBytes(StandardCharsets.UTF_8))));
            this.f3551b.putString((String) pair.first, (String) pair.second);
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f3553d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3552c;
        a();
        try {
            return this.f3551b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8 + length);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new x.f(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        b bVar = this.f3550a;
        bVar.getClass();
        if (b.c(str)) {
            throw new SecurityException(wi.d.h(str, " is a reserved key for the encryption keyset."));
        }
        this.f3551b.remove(bVar.a(str));
        this.f3552c.add(str);
        return this;
    }
}
