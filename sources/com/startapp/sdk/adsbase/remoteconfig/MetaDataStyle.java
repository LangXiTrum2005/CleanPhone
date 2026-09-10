package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class MetaDataStyle implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f40711a = new HashSet(Arrays.asList("BOLD"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Integer f40712b = 14;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer f40713c = -1;
    public static final HashSet d = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private String name = "";
    private Integer itemGradientTop = -14014151;
    private Integer itemGradientBottom = -8750199;
    private Integer itemTitleTextSize = 18;
    private Integer itemTitleTextColor = -1;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f40711a;
    private Integer itemDescriptionTextSize = f40712b;
    private Integer itemDescriptionTextColor = f40713c;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = d;

    public final Integer a() {
        return this.itemDescriptionTextColor;
    }

    public final Set b() {
        return this.itemDescriptionTextDecoration;
    }

    public final Integer c() {
        return this.itemDescriptionTextSize;
    }

    public final Integer d() {
        return this.itemGradientBottom;
    }

    public final Integer e() {
        return this.itemGradientTop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
            if (vi.a((Object) this.name, (Object) metaDataStyle.name) && vi.a((Object) this.itemGradientTop, (Object) metaDataStyle.itemGradientTop) && vi.a((Object) this.itemGradientBottom, (Object) metaDataStyle.itemGradientBottom) && vi.a((Object) this.itemTitleTextSize, (Object) metaDataStyle.itemTitleTextSize) && vi.a((Object) this.itemTitleTextColor, (Object) metaDataStyle.itemTitleTextColor) && vi.a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) && vi.a((Object) this.itemDescriptionTextSize, (Object) metaDataStyle.itemDescriptionTextSize) && vi.a((Object) this.itemDescriptionTextColor, (Object) metaDataStyle.itemDescriptionTextColor) && vi.a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration)) {
                return true;
            }
        }
        return false;
    }

    public final Integer f() {
        return this.itemTitleTextColor;
    }

    public final Set g() {
        return this.itemTitleTextDecoration;
    }

    public final Integer h() {
        return this.itemTitleTextSize;
    }

    public final int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
