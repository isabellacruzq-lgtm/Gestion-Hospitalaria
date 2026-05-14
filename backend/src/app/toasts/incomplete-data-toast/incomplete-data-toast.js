function showIncompleteDataToast() {
    const toast = document.getElementById('incomplete-data-toast');
    toast.classList.remove('hidden');
}

function hideIncompleteDataToast() {
    const toast = document.getElementById('incomplete-data-toast');
    toast.classList.add('hidden');
}

function goBack() {
    alert('Going back');
    hideIncompleteDataToast();
}

function fillFields() {
    alert('Redirecting to fill fields');
    hideIncompleteDataToast();
}