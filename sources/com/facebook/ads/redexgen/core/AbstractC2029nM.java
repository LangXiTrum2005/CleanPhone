package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2029nM {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A01(@CheckForNull InterfaceC2024nH<?, ?> multimap, Object object) {
        if (object == multimap) {
            return true;
        }
        if (object instanceof InterfaceC2024nH) {
            return multimap.A47().equals(((InterfaceC2024nH) object).A47());
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iP != com.google.common.base.Supplier<? extends java.util.List<V>> */
    public static <K, V> OB<K, V> A00(final Map<K, Collection<V>> map, final InterfaceC1729iP<? extends List<V>> factory) {
        return new AbstractC03470j<K, V>(map, factory) { // from class: com.facebook.ads.redexgen.X.0Q
            public static final long serialVersionUID = 0;
            public transient InterfaceC1729iP<? extends List<V>> A00;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iP != com.google.common.base.Supplier<? extends java.util.List<V>> */
            {
                this.A00 = (InterfaceC1729iP) AbstractC1718iD.A04(factory);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.core.AbstractC0928Ob
            public final Map<K, Collection<V>> A00() {
                return A0J();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.core.AbstractC0928Ob
            public final Set<K> A02() {
                return A0K();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.core.C4U
            /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
            public final List<V> A0D() {
                return this.A00.get();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
                stream.defaultReadObject();
                this.A00 = (InterfaceC1729iP) Objects.requireNonNull(stream.readObject());
                Map<K, Collection<V>> map2 = (Map) Objects.requireNonNull(stream.readObject());
                A0L(map2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Q != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            private void writeObject(ObjectOutputStream stream) throws IOException {
                stream.defaultWriteObject();
                stream.writeObject(this.A00);
                stream.writeObject(A0I());
            }
        };
    }
}
