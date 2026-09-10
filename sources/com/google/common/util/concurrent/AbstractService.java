package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractService implements Service {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$1, reason: invalid class name */
    public class AnonymousClass1 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            return "starting()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$2, reason: invalid class name */
    public class AnonymousClass2 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            return "running()";
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$3, reason: invalid class name */
    class AnonymousClass3 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$4, reason: invalid class name */
    class AnonymousClass4 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$5, reason: invalid class name */
    class AnonymousClass5 implements ListenerCallQueue.Event<Service.Listener> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20117a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f20117a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20117a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20117a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20117a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20117a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20117a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final class HasReachedRunningGuard extends Monitor.Guard {
    }

    public final class IsStartableGuard extends Monitor.Guard {
    }

    public final class IsStoppableGuard extends Monitor.Guard {
    }

    public final class IsStoppedGuard extends Monitor.Guard {
    }

    public static final class StateSnapshot {
    }

    public String toString() {
        throw null;
    }
}
