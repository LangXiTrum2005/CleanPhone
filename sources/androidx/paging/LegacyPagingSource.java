package androidx.paging;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/LegacyPagingSource;", "", "Key", "Value", "Landroidx/paging/PagingSource;", "Landroidx/paging/CompatLegacyPagingSource;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value> implements CompatLegacyPagingSource {

    /* JADX INFO: renamed from: androidx.paging.LegacyPagingSource$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 implements DataSource.InvalidatedCallback, FunctionAdapter {
        @Override // androidx.paging.DataSource.InvalidatedCallback
        public final void a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof FunctionAdapter)) {
                throw null;
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            throw null;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: androidx.paging.LegacyPagingSource$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass2 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: androidx.paging.LegacyPagingSource$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        final /* synthetic */ class AnonymousClass1 implements DataSource.InvalidatedCallback, FunctionAdapter {
            @Override // androidx.paging.DataSource.InvalidatedCallback
            public final void a() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof FunctionAdapter)) {
                    throw null;
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function getFunctionDelegate() {
                throw null;
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/LegacyPagingSource$Companion;", "", "", "PAGE_SIZE_NOT_SET", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
