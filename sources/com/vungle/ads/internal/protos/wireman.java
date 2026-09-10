package com.vungle.ads.internal.protos;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: Sdk.java */
/* JADX INFO: loaded from: classes2.dex */
public interface wireman extends MessageLiteOrBuilder {
    long getAdLoadType();

    String getAdSource();

    ByteString getAdSourceBytes();

    String getAdState();

    ByteString getAdStateBytes();

    String getAdapterAdFormat();

    ByteString getAdapterAdFormatBytes();

    long getAppState();

    long getAt();

    String getConnectionType();

    ByteString getConnectionTypeBytes();

    String getConnectionTypeDetail();

    String getConnectionTypeDetailAndroid();

    ByteString getConnectionTypeDetailAndroidBytes();

    ByteString getConnectionTypeDetailBytes();

    String getCreativeId();

    ByteString getCreativeIdBytes();

    String getEventId();

    ByteString getEventIdBytes();

    String getExperiments();

    ByteString getExperimentsBytes();

    boolean getIsAdPodding();

    boolean getIsAdoEnabled();

    long getIsHbPlacement();

    boolean getIsLowDataModeEnabled();

    boolean getIsPartialDownloadEnabled();

    String getMake();

    ByteString getMakeBytes();

    String getMediationName();

    ByteString getMediationNameBytes();

    String getMessage();

    ByteString getMessageBytes();

    String getModel();

    ByteString getModelBytes();

    String getOs();

    ByteString getOsBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    String getPlacementReferenceId();

    ByteString getPlacementReferenceIdBytes();

    String getPlacementType();

    ByteString getPlacementTypeBytes();

    Sdk$SDKError.Reason getReason();

    int getReasonValue();

    String getSessionId();

    ByteString getSessionIdBytes();

    String getVmVersion();

    ByteString getVmVersionBytes();
}
