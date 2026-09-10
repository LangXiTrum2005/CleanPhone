package com.vungle.ads.internal.protos;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: Sdk.java */
/* JADX INFO: loaded from: classes2.dex */
public interface marial extends MessageLiteOrBuilder {
    long getAdLoadType();

    String getAdSource();

    ByteString getAdSourceBytes();

    String getAdState();

    ByteString getAdStateBytes();

    String getAdapterAdFormat();

    ByteString getAdapterAdFormatBytes();

    long getAppState();

    String getConnectionType();

    ByteString getConnectionTypeBytes();

    String getConnectionTypeDetail();

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

    String getMeta();

    ByteString getMetaBytes();

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

    String getSessionId();

    ByteString getSessionIdBytes();

    Sdk$SDKMetric.SDKMetricType getType();

    int getTypeValue();

    long getValue();

    String getVmVersion();

    ByteString getVmVersionBytes();
}
