package com.facebook.ads.redexgen.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5J extends OP<String, List<String>> {
    public static String[] A01 = {"y5Omqd0KNqnxhfv", "MPdtUFUWOKm4RRZZAKZacrngeG7HJfDu", "hXXgGlzVwlUCjLYNKr2y1wzg37lS3KS5", "JDRzHEg2EbBgqUjiDuWZPseAJJQ8XNnd", "su8ZDDBarlclpRChzkOjePE0f3FbEkwZ", "Vciqh5svLHt6zgDIaGhS8lerDc3d4bhg", "Uz7FsX43TNiuExpTOfFK5gvfIrPoZoOc", "Z0lPBCuQyPQsbTEsVdx4L8EqGlh1Jw8G"};
    public final Map<String, List<String>> A00;

    public C5J(Map<String, List<String>> headers) {
        this.A00 = headers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.OP, java.util.Map
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final List<String> get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    public static /* synthetic */ boolean A01(String str) {
        return str != null;
    }

    public static /* synthetic */ boolean A02(Map.Entry entry) {
        return entry.getKey() != null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1913lS
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> A03() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.OP, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.facebook.ads.redexgen.core.OP, java.util.Map
    public final boolean containsValue(Object obj) {
        return A06(obj);
    }

    @Override // com.facebook.ads.redexgen.core.OP, java.util.Map
    public final Set<Map.Entry<String, List<String>>> entrySet() {
        return AbstractC2062nx.A07(super.entrySet(), new InterfaceC1719iE() { // from class: com.facebook.ads.redexgen.X.Pr
            @Override // com.facebook.ads.redexgen.core.InterfaceC1719iE
            public final boolean A42(Object obj) {
                return C5J.A02((Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null) {
            boolean zA07 = A07(obj);
            if (A01[0].length() != 15) {
                throw new RuntimeException();
            }
            A01[0] = "QJ3R8qCOcqkIW24";
            if (zA07) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return A04();
    }

    @Override // com.facebook.ads.redexgen.core.OP, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.facebook.ads.redexgen.core.OP, java.util.Map
    public final Set<String> keySet() {
        return AbstractC2062nx.A07(super.keySet(), new InterfaceC1719iE() { // from class: com.facebook.ads.redexgen.X.Ps
            @Override // com.facebook.ads.redexgen.core.InterfaceC1719iE
            public final boolean A42(Object obj) {
                return C5J.A01((String) obj);
            }
        });
    }

    @Override // com.facebook.ads.redexgen.core.OP, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
