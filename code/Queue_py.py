from collections import deque

# QUEUE = FIFO (First In First Out)
# Items are added to the rear and removed from the front

queue = deque()  # Using deque for queue in Python

# Enqueue items (add to rear)
queue.append("Karen")   # front -> Karen
queue.append("Kevin")   # rear -> Kevin
queue.append("Khalid")  # rear -> Khalid

print("Queue:", queue)

# Peek front element (first added)
print("Front element (peek):", queue[0])

# Dequeue element (remove front)
removed_item = queue.popleft()
print("Removed:", removed_item)
print("Queue after dequeue:", queue)

# Check if queue is empty
print("Is queue empty?", len(queue) == 0)

# Size of queue
print("Queue size:", len(queue))

# Search example
print("Is 'Kevin' in queue?", "Kevin" in queue)

# NOTE: Queue is FIFO → first added is first removed