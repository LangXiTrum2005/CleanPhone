package com.smartdigimkt.h8;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class k implements com.smartdigimkt.i8.b<Set<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final k f35774a = new k();

    private k() {
    }

    @Override // com.smartdigimkt.i8.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> a(byte[] bArr, int i2, int i3) {
        int i4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i3 > 0) {
            f fVar = new f(bArr, i2);
            int i5 = i2 + i3;
            while (true) {
                i4 = fVar.f35746c;
                if (i4 >= i5) {
                    break;
                }
                linkedHashSet.add(fVar.e(fVar.e()));
            }
            if (i4 != i5) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.smartdigimkt.i8.b
    public String a() {
        return "StringSet";
    }

    @Override // com.smartdigimkt.i8.b
    public byte[] a(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int iF = 0;
        int i2 = 0;
        for (String str : set) {
            if (str == null) {
                iF += 5;
                iArr[i2] = -1;
            } else {
                int iB = f.b(str);
                strArr[i2] = str;
                iArr[i2] = iB;
                iF = f.f(iB) + iB + iF;
            }
            i2++;
        }
        f fVar = new f(iF);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            fVar.h(i4);
            if (i4 >= 0) {
                fVar.c(strArr[i3]);
            }
        }
        return fVar.f35745b;
    }
}
