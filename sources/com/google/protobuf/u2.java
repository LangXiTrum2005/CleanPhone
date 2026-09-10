package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a2 f24958b = new a2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24959a;

    public u2(int i10) {
        a3 a3Var;
        switch (i10) {
            case 1:
                this.f24959a = new ArrayDeque();
                break;
            default:
                try {
                    a3Var = (a3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    a3Var = f24958b;
                }
                a3[] a3VarArr = {a2.f24764b, a3Var};
                t2 t2Var = new t2();
                t2Var.f24951a = a3VarArr;
                this.f24959a = (a3) Internal.checkNotNull(t2Var, "messageInfoFactory");
                break;
        }
    }

    public void a(ByteString byteString) {
        if (!byteString.isBalanced()) {
            if (!(byteString instanceof w3)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
            w3 w3Var = (w3) byteString;
            a(w3Var.f24994b);
            a(w3Var.f24995c);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(w3.f24992f, byteString.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iB = w3.b(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f24959a;
        if (arrayDeque.isEmpty() || ((ByteString) arrayDeque.peek()).size() >= iB) {
            arrayDeque.push(byteString);
            return;
        }
        int iB2 = w3.b(iBinarySearch);
        ByteString w3Var2 = (ByteString) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ByteString) arrayDeque.peek()).size() < iB2) {
            w3Var2 = new w3((ByteString) arrayDeque.pop(), w3Var2);
        }
        w3 w3Var3 = new w3(w3Var2, byteString);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(w3.f24992f, w3Var3.f24993a);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ByteString) arrayDeque.peek()).size() >= w3.b(iBinarySearch2 + 1)) {
                break;
            } else {
                w3Var3 = new w3((ByteString) arrayDeque.pop(), w3Var3);
            }
        }
        arrayDeque.push(w3Var3);
    }
}
