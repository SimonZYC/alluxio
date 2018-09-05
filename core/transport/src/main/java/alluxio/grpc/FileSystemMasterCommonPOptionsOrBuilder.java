// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_master.proto

package alluxio.grpc;

public interface FileSystemMasterCommonPOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.FileSystemMasterCommonPOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 syncIntervalMs = 1;</code>
   */
  boolean hasSyncIntervalMs();
  /**
   * <code>optional int64 syncIntervalMs = 1;</code>
   */
  long getSyncIntervalMs();

  /**
   * <code>optional int64 ttl = 2;</code>
   */
  boolean hasTtl();
  /**
   * <code>optional int64 ttl = 2;</code>
   */
  long getTtl();

  /**
   * <code>optional .alluxio.grpc.TtlAction ttlAction = 3;</code>
   */
  boolean hasTtlAction();
  /**
   * <code>optional .alluxio.grpc.TtlAction ttlAction = 3;</code>
   */
  alluxio.grpc.TtlAction getTtlAction();
}
