package zb;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f54681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f54682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f54683c;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("X86_32", 0);
        e eVar2 = new e("X86_64", 1);
        e eVar3 = new e("ARM_UNKNOWN", 2);
        e eVar4 = new e("PPC", 3);
        e eVar5 = new e("PPC64", 4);
        e eVar6 = new e("ARMV6", 5);
        e eVar7 = new e("ARMV7", 6);
        e eVar8 = new e("UNKNOWN", 7);
        f54681a = eVar8;
        e eVar9 = new e("ARMV7S", 8);
        e eVar10 = new e("ARM64", 9);
        f54683c = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10};
        HashMap map = new HashMap(4);
        f54682b = map;
        map.put("armeabi-v7a", eVar7);
        map.put("armeabi", eVar6);
        map.put("arm64-v8a", eVar10);
        map.put("x86", eVar);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f54683c.clone();
    }
}
