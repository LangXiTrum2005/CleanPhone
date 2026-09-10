package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class BaseImplementation {

    public interface ResultHolder<R> {
        void setFailedResult(Status status);

        void setResult(R r);
    }

    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        private final Api<?> api;
        private final Api.AnyClientKey<A> clientKey;

        @Deprecated
        public ApiMethodImpl(Api.AnyClientKey<A> anyClientKey, GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.clientKey = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.api = null;
        }

        private void setFailedResult(RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        public abstract void doExecute(A a2) throws RemoteException;

        public final Api<?> getApi() {
            return this.api;
        }

        public final Api.AnyClientKey<A> getClientKey() {
            return this.clientKey;
        }

        public void onSetFailedResult(R r) {
        }

        public final void run(A a2) throws DeadObjectException {
            try {
                doExecute(a2);
            } catch (DeadObjectException e2) {
                setFailedResult(e2);
                throw e2;
            } catch (RemoteException e3) {
                setFailedResult(e3);
            }
        }

        public /* bridge */ /* synthetic */ void setResult(Object obj) {
            setResult((Result) obj);
        }

        public ApiMethodImpl(Api<?> api, GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.checkNotNull(api, "Api must not be null");
            this.clientKey = api.zab();
            this.api = api;
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public final void setFailedResult(Status status) {
            Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R rCreateFailedResult = createFailedResult(status);
            setResult((Result) rCreateFailedResult);
            onSetFailedResult(rCreateFailedResult);
        }

        public ApiMethodImpl(BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.clientKey = new Api.AnyClientKey<>();
            this.api = null;
        }
    }
}
