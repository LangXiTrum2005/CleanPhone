package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/DataSource;", "", "Key", "Value", "BaseResult", "Companion", "Factory", "InvalidatedCallback", "KeyType", "Params", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DataSource<Key, Value> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/DataSource$BaseResult;", "", "Value", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BaseResult<Value> {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/DataSource$BaseResult$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BaseResult)) {
                return false;
            }
            ((BaseResult) obj).getClass();
            return Intrinsics.a(null, null) && Intrinsics.a(null, null) && Intrinsics.a(null, null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/DataSource$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/DataSource$Factory;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Factory<Key, Value> {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/paging/DataSource$InvalidatedCallback;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface InvalidatedCallback {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/DataSource$KeyType;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KeyType {
        public static final /* synthetic */ KeyType[] X = {new KeyType("POSITIONAL", 0), new KeyType("PAGE_KEYED", 1), new KeyType("ITEM_KEYED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        KeyType EF5;

        public static KeyType valueOf(String str) {
            return (KeyType) Enum.valueOf(KeyType.class, str);
        }

        public static KeyType[] values() {
            return (KeyType[]) X.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/paging/DataSource$Params;", "", "K", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Params<K> {
    }

    public boolean a() {
        throw null;
    }
}
