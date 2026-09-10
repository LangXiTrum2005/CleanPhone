package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends i1 {
    @Override // com.google.protobuf.i1
    public final Object a(Object obj, b0 b0Var, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, v1 v1Var, Object obj2, q4 q4Var) throws IOException {
        Object objValueOf;
        Object objF;
        ArrayList arrayList;
        int number = generatedExtension.getNumber();
        c2 c2Var = generatedExtension.descriptor;
        if (c2Var.f24786d && c2Var.f24787e) {
            switch (j1.f24873a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    b0Var.g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    b0Var.l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    b0Var.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    b0Var.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    b0Var.m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    b0Var.k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    b0Var.j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    b0Var.d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    b0Var.u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    b0Var.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    b0Var.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    b0Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    b0Var.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    b0Var.h(arrayList);
                    obj2 = y3.j(obj, number, arrayList, generatedExtension.descriptor.f24783a, obj2, q4Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.f24785c);
            }
            v1Var.p(generatedExtension.descriptor, arrayList);
            return obj2;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (j1.f24873a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    b0Var.x(1);
                    objValueOf = Double.valueOf(b0Var.f24771a.readDouble());
                    break;
                case 2:
                    b0Var.x(5);
                    objValueOf = Float.valueOf(b0Var.f24771a.readFloat());
                    break;
                case 3:
                    b0Var.x(0);
                    objValueOf = Long.valueOf(b0Var.f24771a.readInt64());
                    break;
                case 4:
                    b0Var.x(0);
                    objValueOf = Long.valueOf(b0Var.f24771a.readUInt64());
                    break;
                case 5:
                    b0Var.x(0);
                    objValueOf = Integer.valueOf(b0Var.f24771a.readInt32());
                    break;
                case 6:
                    b0Var.x(1);
                    objValueOf = Long.valueOf(b0Var.f24771a.readFixed64());
                    break;
                case 7:
                    b0Var.x(5);
                    objValueOf = Integer.valueOf(b0Var.f24771a.readFixed32());
                    break;
                case 8:
                    b0Var.x(0);
                    objValueOf = Boolean.valueOf(b0Var.f24771a.readBool());
                    break;
                case 9:
                    b0Var.x(0);
                    objValueOf = Integer.valueOf(b0Var.f24771a.readUInt32());
                    break;
                case 10:
                    b0Var.x(5);
                    objValueOf = Integer.valueOf(b0Var.f24771a.readSFixed32());
                    break;
                case 11:
                    b0Var.x(1);
                    objValueOf = Long.valueOf(b0Var.f24771a.readSFixed64());
                    break;
                case 12:
                    b0Var.x(0);
                    objValueOf = Integer.valueOf(b0Var.f24771a.readSInt32());
                    break;
                case 13:
                    b0Var.x(0);
                    objValueOf = Long.valueOf(b0Var.f24771a.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = b0Var.e();
                    break;
                case 16:
                    b0Var.x(2);
                    objValueOf = b0Var.f24771a.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object objF2 = v1Var.f(generatedExtension.descriptor);
                        if (objF2 instanceof GeneratedMessageLite) {
                            p3 p3Var = p3.f24916c;
                            p3Var.getClass();
                            x3 x3VarA = p3Var.a(objF2.getClass());
                            if (!((GeneratedMessageLite) objF2).isMutable()) {
                                Object objD = x3VarA.d();
                                x3VarA.a(objD, objF2);
                                v1Var.p(generatedExtension.descriptor, objD);
                                objF2 = objD;
                            }
                            b0Var.x(3);
                            b0Var.b(objF2, x3VarA, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                    b0Var.x(3);
                    x3 x3VarA2 = p3.f24916c.a(cls);
                    Object objD2 = x3VarA2.d();
                    b0Var.b(objD2, x3VarA2, extensionRegistryLite);
                    x3VarA2.b(objD2);
                    objValueOf = objD2;
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object objF3 = v1Var.f(generatedExtension.descriptor);
                        if (objF3 instanceof GeneratedMessageLite) {
                            p3 p3Var2 = p3.f24916c;
                            p3Var2.getClass();
                            x3 x3VarA3 = p3Var2.a(objF3.getClass());
                            if (!((GeneratedMessageLite) objF3).isMutable()) {
                                Object objD3 = x3VarA3.d();
                                x3VarA3.a(objD3, objF3);
                                v1Var.p(generatedExtension.descriptor, objD3);
                                objF3 = objD3;
                            }
                            b0Var.x(2);
                            b0Var.c(objF3, x3VarA3, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    objValueOf = b0Var.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            b0Var.x(0);
            int int32 = b0Var.f24771a.readInt32();
            if (generatedExtension.descriptor.f24783a.findValueByNumber(int32) == null) {
                return y3.n(obj, number, int32, obj2, q4Var);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (generatedExtension.isRepeated()) {
            v1Var.a(generatedExtension.descriptor, objValueOf);
            return obj2;
        }
        int i10 = j1.f24873a[generatedExtension.getLiteType().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objF = v1Var.f(generatedExtension.descriptor)) != null) {
            objValueOf = Internal.mergeMessage(objF, objValueOf);
        }
        v1Var.p(generatedExtension.descriptor, objValueOf);
        return obj2;
    }

    @Override // com.google.protobuf.i1
    public final void b(l5 l5Var, Map.Entry entry) throws IOException {
        c2 c2Var = (c2) entry.getKey();
        boolean z10 = c2Var.f24786d;
        WireFormat.FieldType fieldType = c2Var.f24785c;
        boolean z11 = c2Var.f24787e;
        int i10 = c2Var.f24784b;
        if (z10) {
            switch (j1.f24873a[fieldType.ordinal()]) {
                case 1:
                    y3.q(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 2:
                    y3.u(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 3:
                    y3.x(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 4:
                    y3.F(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 5:
                    y3.w(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 6:
                    y3.t(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 7:
                    y3.s(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 8:
                    y3.o(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 9:
                    y3.E(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 10:
                    y3.z(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 11:
                    y3.A(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 12:
                    y3.B(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 13:
                    y3.C(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 14:
                    y3.w(i10, (List) entry.getValue(), l5Var, z11);
                    break;
                case 15:
                    y3.p(i10, (List) entry.getValue(), l5Var);
                    break;
                case 16:
                    y3.D(i10, (List) entry.getValue(), l5Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        y3.v(i10, (List) entry.getValue(), l5Var, p3.f24916c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        y3.y(i10, (List) entry.getValue(), l5Var, p3.f24916c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (j1.f24873a[fieldType.ordinal()]) {
            case 1:
                ((l0) l5Var).f24893a.writeDouble(i10, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ((l0) l5Var).f24893a.writeFloat(i10, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                ((l0) l5Var).f(i10, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((l0) l5Var).f24893a.writeUInt64(i10, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((l0) l5Var).e(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((l0) l5Var).c(i10, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((l0) l5Var).b(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((l0) l5Var).f24893a.writeBool(i10, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((l0) l5Var).f24893a.writeUInt32(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((l0) l5Var).f24893a.writeSFixed32(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((l0) l5Var).f24893a.writeSFixed64(i10, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((l0) l5Var).f24893a.writeSInt32(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((l0) l5Var).f24893a.writeSInt64(i10, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((l0) l5Var).e(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((l0) l5Var).a(i10, (ByteString) entry.getValue());
                break;
            case 16:
                ((l0) l5Var).f24893a.writeString(i10, (String) entry.getValue());
                break;
            case 17:
                ((l0) l5Var).d(i10, entry.getValue(), p3.f24916c.a(entry.getValue().getClass()));
                break;
            case 18:
                ((l0) l5Var).g(i10, entry.getValue(), p3.f24916c.a(entry.getValue().getClass()));
                break;
        }
    }
}
