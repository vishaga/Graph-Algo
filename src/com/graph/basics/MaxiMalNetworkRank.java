package com.graph.basics;

/**
 * <h1>Maximal Network Rank</h1>
 * 
 * <p>
 * There is an infrastructure of n cities with some number of roads connecting
 * these cities. Each roads[i] = [ai, bi] indicates that there is a
 * bidirectional road between cities ai and bi. The network rank of two
 * different cities is defined as the total number of directly connected roads
 * to either city. If a road is directly connected to both cities, it is only
 * counted once. The maximal network rank of the infrastructure is the maximum
 * network rank of all pairs of different cities.
 * 
 * <p>
 * Given the integer n and the array roads, return the maximal network rank of
 * the entire infrastructure. Constraints: 2 <= n <= 100 0 <= roads.length <= n
 * * (n - 1) / 2 roads[i].length == 2 0 <= ai, bi <= n-1 ai != bi Each pair of
 * cities has at most one road connecting them.
 * 
 * <p>
 * Example :
 * 
 * Input: n = 4, roads = [[0,1],[0,3],[1,2],[1,3]] Output: 4 Explanation: The
 * network rank of cities 0 and 1 is 4 as there are 4 roads that are connected
 * to either 0 or 1. The road between 0 and 1 is only counted once.
 * 
 * Expected Time Complexity: O(n^2)
 * 
 * @author vishaga
 *
 */

public class MaxiMalNetworkRank {

}
