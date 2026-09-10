package com.vungle.ads.internal.protos;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: compiled from: Sdk.java */
/* JADX INFO: loaded from: classes2.dex */
public interface dern extends MessageLiteOrBuilder {
    Sdk$SDKError getErrors(int i);

    int getErrorsCount();

    List<Sdk$SDKError> getErrorsList();
}
