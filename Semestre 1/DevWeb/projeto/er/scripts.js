function updateOutput() {
    const htmlCode = document.getElementById('html-input').value;
    const cssCode = document.getElementById('css-input').value;
    const jsCode = document.getElementById('js-input').value;

    const outputDiv = document.getElementById('code-output');

    outputDiv.innerHTML = '';

    const iframe = document.createElement('iframe');
    iframe.style.width = '100%';
    iframe.style.height = '100%';
    iframe.style.border = 'none';

    outputDiv.appendChild(iframe);
}

document.getElementById('html-input').addEventListener('input', updateOutput);
document.getElementById('css-input').addEventListener('input', updateOutput);
document.getElementById('jsinput').addEventListener('input', updateOutput);