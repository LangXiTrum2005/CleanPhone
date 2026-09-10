package com.google.android.datatransport;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ProductData extends ProductData {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        ((ProductData) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 1000003;
    }

    public final String toString() {
        return "ProductData{productId=null}";
    }
}
