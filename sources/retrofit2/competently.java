package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class competently extends dern.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    @Nullable
    public final Executor f36458attabal;

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public class attabal implements dern<Object, retrofit2.saneness<?>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Type f36459attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Executor f36461saneness;

        public attabal(Type type, Executor executor) {
            this.f36459attabal = type;
            this.f36461saneness = executor;
        }

        @Override // retrofit2.dern
        public Type attabal() {
            return this.f36459attabal;
        }

        @Override // retrofit2.dern
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public retrofit2.saneness<Object> saneness(retrofit2.saneness<Object> sanenessVar) {
            Executor executor = this.f36461saneness;
            return executor == null ? sanenessVar : new saneness(executor, sanenessVar);
        }
    }

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public static final class saneness<T> implements retrofit2.saneness<T> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final retrofit2.saneness<T> f36462arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Executor f36463kowloon;

        /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
        public class attabal implements wireman<T> {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ wireman f36464attabal;

            public attabal(wireman wiremanVar) {
                this.f36464attabal = wiremanVar;
            }

            public static /* synthetic */ void wireman(attabal attabalVar, wireman wiremanVar, rotuma rotumaVar) {
                if (saneness.this.f36462arytenoidectomy.isCanceled()) {
                    wiremanVar.attabal(saneness.this, new IOException("Canceled"));
                } else {
                    wiremanVar.saneness(saneness.this, rotumaVar);
                }
            }

            @Override // retrofit2.wireman
            public void attabal(retrofit2.saneness<T> sanenessVar, final Throwable th) {
                Executor executor = saneness.this.f36463kowloon;
                final wireman wiremanVar = this.f36464attabal;
                executor.execute(new Runnable() { // from class: retrofit2.taiyuan
                    @Override // java.lang.Runnable
                    public final void run() {
                        wiremanVar.attabal(competently.saneness.this, th);
                    }
                });
            }

            @Override // retrofit2.wireman
            public void saneness(retrofit2.saneness<T> sanenessVar, final rotuma<T> rotumaVar) {
                Executor executor = saneness.this.f36463kowloon;
                final wireman wiremanVar = this.f36464attabal;
                executor.execute(new Runnable() { // from class: retrofit2.impromptu
                    @Override // java.lang.Runnable
                    public final void run() {
                        competently.saneness.attabal.wireman(this.f36543kowloon, wiremanVar, rotumaVar);
                    }
                });
            }
        }

        public saneness(Executor executor, retrofit2.saneness<T> sanenessVar) {
            this.f36463kowloon = executor;
            this.f36462arytenoidectomy = sanenessVar;
        }

        @Override // retrofit2.saneness
        public void arytenoidectomy(wireman<T> wiremanVar) {
            Objects.requireNonNull(wiremanVar, "callback == null");
            this.f36462arytenoidectomy.arytenoidectomy(new attabal(wiremanVar));
        }

        @Override // retrofit2.saneness
        public void cancel() {
            this.f36462arytenoidectomy.cancel();
        }

        @Override // retrofit2.saneness
        public boolean isCanceled() {
            return this.f36462arytenoidectomy.isCanceled();
        }

        @Override // retrofit2.saneness
        public okhttp3.preprohormone request() {
            return this.f36462arytenoidectomy.request();
        }

        @Override // retrofit2.saneness
        public retrofit2.saneness<T> clone() {
            return new saneness(this.f36463kowloon, this.f36462arytenoidectomy.clone());
        }
    }

    public competently(@Nullable Executor executor) {
        this.f36458attabal = executor;
    }

    @Override // retrofit2.dern.attabal
    @Nullable
    public dern<?, ?> attabal(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar) {
        if (dern.attabal.dern(type) != retrofit2.saneness.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new attabal(trm.competently(0, (ParameterizedType) type), trm.formularize(annotationArr, cuirassed.class) ? null : this.f36458attabal);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
