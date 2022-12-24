package com.brewery.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jt on 2/26/20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocationFailureEvent {
    private UUID orderId;
}
