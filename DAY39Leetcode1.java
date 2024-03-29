// Top K Frequent Element //

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        // Step 1: Populate the frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create the priority queue (min heap) and insert elements based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.offer(entry);
            // Keep the size of the queue limited to k
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        // Step 3: Extract k most frequent elements from the priority queue
         int[] result = new int[k];
        int index = k - 1;
        while (!priorityQueue.isEmpty()) {
            result[index--] = priorityQueue.poll().getKey();
        }

        return result;
        
    }
}


// Expected Output //
