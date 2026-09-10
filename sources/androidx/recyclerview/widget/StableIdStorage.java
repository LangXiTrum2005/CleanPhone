package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
interface StableIdStorage {

    public static class IsolatedStableIdStorage implements StableIdStorage {

        public class WrapperStableIdLookup implements StableIdLookup {
        }
    }

    public static class NoStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1, reason: invalid class name */
        public class AnonymousClass1 implements StableIdLookup {
        }
    }

    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1, reason: invalid class name */
        public class AnonymousClass1 implements StableIdLookup {
        }
    }

    public interface StableIdLookup {
    }
}
