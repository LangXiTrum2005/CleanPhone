package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import android.support.v4.media.a;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmProtoBufUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExtensionRegistryLite f44158a;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        extensionRegistryLite.a(JvmProtoBuf.f44128a);
        extensionRegistryLite.a(JvmProtoBuf.f44129b);
        extensionRegistryLite.a(JvmProtoBuf.f44130c);
        extensionRegistryLite.a(JvmProtoBuf.d);
        extensionRegistryLite.a(JvmProtoBuf.f44131e);
        extensionRegistryLite.a(JvmProtoBuf.f);
        extensionRegistryLite.a(JvmProtoBuf.g);
        extensionRegistryLite.a(JvmProtoBuf.f44132h);
        extensionRegistryLite.a(JvmProtoBuf.f44133i);
        extensionRegistryLite.a(JvmProtoBuf.j);
        extensionRegistryLite.a(JvmProtoBuf.k);
        extensionRegistryLite.a(JvmProtoBuf.f44134l);
        extensionRegistryLite.a(JvmProtoBuf.m);
        extensionRegistryLite.a(JvmProtoBuf.f44135n);
        f44158a = extensionRegistryLite;
    }

    public static JvmMemberSignature.Method a(ProtoBuf.Constructor proto, NameResolver nameResolver, TypeTable typeTable) {
        String strD;
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension constructorSignature = JvmProtoBuf.f44128a;
        Intrinsics.e(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.a(proto, constructorSignature);
        String string = (jvmMethodSignature == null || (jvmMethodSignature.f44138Y & 1) != 1) ? "<init>" : nameResolver.getString(jvmMethodSignature.Z);
        if (jvmMethodSignature == null || (jvmMethodSignature.f44138Y & 2) != 2) {
            List list = proto.f0;
            Intrinsics.e(list, "proto.valueParameterList");
            List<ProtoBuf.ValueParameter> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
            for (ProtoBuf.ValueParameter it : list2) {
                Intrinsics.e(it, "it");
                String strE = e(ProtoTypeTableUtilKt.e(it, typeTable), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strD = CollectionsKt.D(arrayList, "", "(", ")V", null, 56);
        } else {
            strD = nameResolver.getString(jvmMethodSignature.e0);
        }
        return new JvmMemberSignature.Method(string, strD);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.f(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.f(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.f(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.Intrinsics.e(r0, r1)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.a(r4, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f44140Y
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.Z
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f44136Y
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.Z
            goto L3b
        L39:
            int r7 = r4.g0
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f44136Y
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.e0
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.d(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field");
    }

    public static JvmMemberSignature.Method c(ProtoBuf.Function proto, NameResolver nameResolver, TypeTable typeTable) {
        String strR;
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension methodSignature = JvmProtoBuf.f44129b;
        Intrinsics.e(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.a(proto, methodSignature);
        int i2 = (jvmMethodSignature == null || (jvmMethodSignature.f44138Y & 1) != 1) ? proto.g0 : jvmMethodSignature.Z;
        if (jvmMethodSignature == null || (jvmMethodSignature.f44138Y & 2) != 2) {
            List listJ = CollectionsKt.J(ProtoTypeTableUtilKt.b(proto, typeTable));
            List list = proto.p0;
            Intrinsics.e(list, "proto.valueParameterList");
            List<ProtoBuf.ValueParameter> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
            for (ProtoBuf.ValueParameter it : list2) {
                Intrinsics.e(it, "it");
                arrayList.add(ProtoTypeTableUtilKt.e(it, typeTable));
            }
            ArrayList arrayListO = CollectionsKt.O(arrayList, listJ);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayListO, 10));
            Iterator it2 = arrayListO.iterator();
            while (it2.hasNext()) {
                String strE = e((ProtoBuf.Type) it2.next(), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(ProtoTypeTableUtilKt.c(proto, typeTable), nameResolver);
            if (strE2 == null) {
                return null;
            }
            strR = a.r(new StringBuilder(), CollectionsKt.D(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strR = nameResolver.getString(jvmMethodSignature.e0);
        }
        return new JvmMemberSignature.Method(nameResolver.getString(i2), strR);
    }

    public static final boolean d(ProtoBuf.Property proto) {
        Intrinsics.f(proto, "proto");
        Flags.BooleanFlagField booleanFlagField = JvmFlags.f44149a;
        Object objI = proto.i(JvmProtoBuf.f44131e);
        Intrinsics.e(objI, "proto.getExtension(JvmProtoBuf.flags)");
        return booleanFlagField.e(((Number) objI).intValue()).booleanValue();
    }

    public static String e(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.p()) {
            return ClassMapperLite.b(nameResolver.b(type.j0));
        }
        return null;
    }

    public static final Pair f(String[] strArr, String[] strings) throws InvalidProtocolBufferException {
        Intrinsics.f(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.a(strArr));
        JvmNameResolver jvmNameResolverG = g(byteArrayInputStream, strings);
        ExtensionRegistryLite extensionRegistryLite = f44158a;
        AbstractParser abstractParser = (AbstractParser) ProtoBuf.Class.L0;
        abstractParser.getClass();
        CodedInputStream codedInputStream = new CodedInputStream(byteArrayInputStream);
        MessageLite messageLite = (MessageLite) abstractParser.a(codedInputStream, extensionRegistryLite);
        try {
            codedInputStream.a(0);
            AbstractParser.b(messageLite);
            return new Pair(jvmNameResolverG, (ProtoBuf.Class) messageLite);
        } catch (InvalidProtocolBufferException e2) {
            e2.X = messageLite;
            throw e2;
        }
    }

    public static JvmNameResolver g(ByteArrayInputStream byteArrayInputStream, String[] strings) {
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) ((AbstractParser) JvmProtoBuf.StringTableTypes.i0).c(byteArrayInputStream, f44158a);
        Intrinsics.e(stringTableTypes, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        Intrinsics.f(strings, "strings");
        List list = stringTableTypes.Z;
        Set setL0 = list.isEmpty() ? EmptySet.X : CollectionsKt.l0(list);
        List<JvmProtoBuf.StringTableTypes.Record> list2 = stringTableTypes.f44142Y;
        Intrinsics.e(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list2) {
            int i2 = record.Z;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return new JvmNameResolver(strings, setL0, arrayList);
    }

    public static final Pair h(String[] data, String[] strings) throws InvalidProtocolBufferException {
        Intrinsics.f(data, "data");
        Intrinsics.f(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.a(data));
        JvmNameResolver jvmNameResolverG = g(byteArrayInputStream, strings);
        ExtensionRegistryLite extensionRegistryLite = f44158a;
        AbstractParser abstractParser = (AbstractParser) ProtoBuf.Package.m0;
        abstractParser.getClass();
        CodedInputStream codedInputStream = new CodedInputStream(byteArrayInputStream);
        MessageLite messageLite = (MessageLite) abstractParser.a(codedInputStream, extensionRegistryLite);
        try {
            codedInputStream.a(0);
            AbstractParser.b(messageLite);
            return new Pair(jvmNameResolverG, (ProtoBuf.Package) messageLite);
        } catch (InvalidProtocolBufferException e2) {
            e2.X = messageLite;
            throw e2;
        }
    }
}
