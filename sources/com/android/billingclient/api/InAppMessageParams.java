package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7120a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f7121a = new HashSet();

        @NonNull
        public Builder addAllInAppMessageCategoriesToShow() {
            this.f7121a.add(2);
            return this;
        }

        @NonNull
        public Builder addInAppMessageCategoryToShow(int i10) {
            this.f7121a.add(Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public InAppMessageParams build() {
            return new InAppMessageParams(this.f7121a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    public /* synthetic */ InAppMessageParams(HashSet hashSet) {
        this.f7120a = new ArrayList(Collections.unmodifiableList(new ArrayList(hashSet)));
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
