// Example script to handle connection logic
Events.on(BuildSelectEvent, event => {
  if (event.builder.buildPlan.block.name === "core-power-node") {
    // Logic to connect core to the new power node
    // This is a placeholder for actual implementation
    event.builder.buildPlan.block.cons.powerProduction = 2.0; // Example of changing production rate
  }
});
