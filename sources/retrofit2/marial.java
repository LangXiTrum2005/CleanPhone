package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class marial extends retrofit2.dern.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final retrofit2.dern.attabal f36545attabal = new marial();

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    public static final class attabal<R> implements retrofit2.dern<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Type f36546attabal;

        /* JADX INFO: renamed from: retrofit2.marial$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        public class C0786attabal implements wireman<R> {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final CompletableFuture<R> f36547attabal;

            public C0786attabal(CompletableFuture<R> completableFuture) {
                this.f36547attabal = completableFuture;
            }

            @Override // retrofit2.wireman
            public void attabal(retrofit2.saneness<R> sanenessVar, Throwable th) {
                this.f36547attabal.completeExceptionally(th);
            }

            @Override // retrofit2.wireman
            public void saneness(retrofit2.saneness<R> sanenessVar, rotuma<R> rotumaVar) {
                if (rotumaVar.wireman()) {
                    this.f36547attabal.complete(rotumaVar.attabal());
                } else {
                    this.f36547attabal.completeExceptionally(new HttpException(rotumaVar));
                }
            }
        }

        public attabal(Type type) {
            this.f36546attabal = type;
        }

        @Override // retrofit2.dern
        public Type attabal() {
            return this.f36546attabal;
        }

        @Override // retrofit2.dern
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> saneness(retrofit2.saneness<R> sanenessVar) {
            saneness sanenessVar2 = new saneness(sanenessVar);
            sanenessVar.arytenoidectomy(new C0786attabal(sanenessVar2));
            return sanenessVar2;
        }
    }

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    public static final class dern<R> implements retrofit2.dern<R, CompletableFuture<rotuma<R>>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Type f36549attabal;

        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        public class attabal implements wireman<R> {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final CompletableFuture<rotuma<R>> f36550attabal;

            public attabal(CompletableFuture<rotuma<R>> completableFuture) {
                this.f36550attabal = completableFuture;
            }

            @Override // retrofit2.wireman
            public void attabal(retrofit2.saneness<R> sanenessVar, Throwable th) {
                this.f36550attabal.completeExceptionally(th);
            }

            @Override // retrofit2.wireman
            public void saneness(retrofit2.saneness<R> sanenessVar, rotuma<R> rotumaVar) {
                this.f36550attabal.complete(rotumaVar);
            }
        }

        public dern(Type type) {
            this.f36549attabal = type;
        }

        @Override // retrofit2.dern
        public Type attabal() {
            return this.f36549attabal;
        }

        @Override // retrofit2.dern
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<rotuma<R>> saneness(retrofit2.saneness<R> sanenessVar) {
            saneness sanenessVar2 = new saneness(sanenessVar);
            sanenessVar.arytenoidectomy(new attabal(sanenessVar2));
            return sanenessVar2;
        }
    }

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    public static final class saneness<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final retrofit2.saneness<?> f36552kowloon;

        public saneness(retrofit2.saneness<?> sanenessVar) {
            this.f36552kowloon = sanenessVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.f36552kowloon.cancel();
            }
            return super.cancel(z);
        }
    }

    @Override // retrofit2.dern.attabal
    @Nullable
    public retrofit2.dern<?, ?> attabal(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar) {
        if (retrofit2.dern.attabal.dern(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeSaneness = retrofit2.dern.attabal.saneness(0, (ParameterizedType) type);
        if (retrofit2.dern.attabal.dern(typeSaneness) != rotuma.class) {
            return new attabal(typeSaneness);
        }
        if (typeSaneness instanceof ParameterizedType) {
            return new dern(retrofit2.dern.attabal.saneness(0, (ParameterizedType) typeSaneness));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
